export default function home(albums){
    return `
        <div class="containter m-3">
            <div class="row row-cols-1 row-cols-md-3 g-4">
                ${albums.map(album =>{
                    return `

                        <div class="col">
                            <div class="card h-100 p-1">
                                <img class="card-img-top" src="${album.imgUrl}">
                                <div class="card-body>
                                    <h5 class="card-title">${album.artist} - ${album.name} (${album.label})</h5>
                                    <p class="card-text">${album.description}</p>
                                    <a href="#" class="btn btn-sm btn-primary">More Info</a>
                                </div>
                            </div>
                        </div>
                        
                        `
                    }).join("")
                }
            </div>
    </div>
    `
}