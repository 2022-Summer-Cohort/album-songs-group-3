export default function albumView(album){
  
  return `
  
    <div class="containter m-3">
        <div class="row">
            
            <div class="albumElement col-4">
                <div class="card h-100">

                    <img class="card-img-top" src="${album.imgUrl}">
                    <div class="card-body">
                        <h5 class="card-title">${album.artist} - ${album.name} (${album.label})</h5>
                        <p class="card-text">${album.description}</p>
                        <a href="#" class="albumButton btn btn-sm btn-primary">More Info</a>
                        <input class="id_field" hidden value="${album.id}">
                    </div>

                </div>
            </div>

            <div class="col-8">
                <ol class="list-group list-group-numbered">
                    <li class="list-group-item">A list item</li>
                    <li class="list-group-item">A list item</li>
                    <li class="list-group-item">A list item</li>
                </ol>
            </div>

        </div>


        <div class = "row">
          ${
            album.songs.map(songs => {
                return `
                    <div class="song">
                        <h3 class "song-title"> ${songs.title}</h3>
                        
                    </div>
                    `
            }).join("")
        }


        </div>

    </div>

    `
}