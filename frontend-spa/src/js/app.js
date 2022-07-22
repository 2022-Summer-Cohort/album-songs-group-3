import home   from "./home.js";
import header from "./header.js";
import footer from "./footer.js";
import albumView from "./albumView.js";

const container = document.querySelector(".container");

function makeHomeView(){
    fetch("http://localhost:8080/api/albums")
    .then(res => res.json())
    .then(albums => {
        container.innerHTML = header();
        container.innerHTML += home(albums);
        container.innerHTML += footer();

        const addAlbumNavigation = document.querySelector(".addAlbum-navigation")
        addAlbumNavigation.classList.remove("disabled");

        const albumElement = document.querySelectorAll(".albumElement");

        albumElement.forEach(album =>{
            const albumButton = album.querySelector(".albumButton");

            albumButton.addEventListener("click",()=>{
                let albumId = album.querySelector(".id_field");
                // alert(`You clicked campus id: ${albumId.value}`);
                console.log(albumId)
                makeAlbumView(albumId.value)
            })
        })
    })
}

function makeAlbumView(albumId){
    fetch(`http://localhost:8080/api/albums/${albumId}`)
    .then(res => res.json())
    .then(album => {
        console.log(album);
        
        container.innerHTML = header();
        container.innerHTML += albumView(album);
        container.innerHTML += footer();
        
        const addAlbumNavigation = document.querySelector(".addAlbum-navigation")
        addAlbumNavigation.classList.add("disabled");

        const backButton = document.querySelector(".home-navigation");

        backButton.addEventListener("click",()=>{
            makeHomeView();
        })

        const songNameIn = container.querySelector(".songNameInput");
        const artistNameIn = container.querySelector(".artistName");
        const songDurationIn = container.querySelector(".songDurationInput");
        const addSongButton = container.querySelector(".addSongButton");

        addSongButton.addEventListener("click",()=>{
            const newSongJson = {
                "name": songNameIn.value,
                "duration": songDurationIn.value,
                "artist": artistNameIn.value,
            }

            fetch(`http://localhost:8080/api/albums/${albumId}/addSong`,{
                method: 'PATCH',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(newSongJson)
            })
            .then(res => res.json())
            .then(album => {
                makeAlbumView(albumId);
            })
        })
    })
    // .catch(err=>console.error(err))
}

makeHomeView()