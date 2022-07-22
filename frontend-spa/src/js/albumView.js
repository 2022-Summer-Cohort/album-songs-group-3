export default function albumView(album){
  
  return `
  
    <div class="containter m-3">

        <div class="row">
            
            <div class="albumElement col-4">
                <div class="card">

                    <img class="card-img-top" src="${album.imgUrl}">
                    <div class="card-body">
                        <h5 class="card-title">${album.artist} - ${album.name} (${album.label})</h5>
                        <p class="card-text">${album.description}</p>
                        <input class="id_field" hidden value="${album.id}">
                        <input class="artistName" hidden value="${album.artist}">
                    </div>

                </div>
            </div>

            <div class="col-8">
                <ol class="list-group list-group-numbered">
                  ${
                    album.songs.map(songs => {
                      return`
                      <li class="list-group-item">${songs.name} - ${songs.duration}min</li>
                      `
                    }).join("")
                  }
                </ol>
            </div>

        </div>

        <div class="row m-3">

            <div class="col-4">
                    <p>asdasdas</p>
            </div>
            
            <div class="col-5">
                <div class="form-floating">
                    <input type="text" class="songNameInput form-control" id="floatingInputGrid" placeholder="Song name" value="Example song">
                    <label for="floatingInputGrid">Song name</label>
                </div>
            </div>
            
            <div class="col-2">
                <div class="form-floating">
                    <input type="text" class="songDurationInput form-control" id="floatingInputGrid" placeholder="Song duration" value="123">
                    <label for="floatingInputGrid">Song duration</label>
                </div>
            </div>
            
            <div class="col-1">
                <button class="addSongButton btn btn-primary" type="submit">Submit</button>
                
            </div>

        </div>  

    </div>



    

    `
}