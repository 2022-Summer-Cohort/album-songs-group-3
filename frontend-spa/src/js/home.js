export default function home(albums){
    return `
    <main class="main-content">
        <section class="album-library">
            ${albums.map(album =>{
                return `
                <div class="row row-cols-1 row-cols-md-3 g-4">
                    <div class="col">
                        <div class="card">
                            <img class="card-img-top" src = ${album.imgUrl}>
                            <div class="card-body>
                                <h5 class="card-title">${album.name}</h5>
                            </div>
                        <div>
                    </div>
                </div>
                        <h1>${album.name}</h1>
                        <h2>${album.artist}</h2>
                        <h3>${album.label}</h3>
                        <p>${album.description}</p>
                        <img src= ${album.imgUrl}>
                `
            }).join("")
        }
    
        </section>
    </main>
    `
}