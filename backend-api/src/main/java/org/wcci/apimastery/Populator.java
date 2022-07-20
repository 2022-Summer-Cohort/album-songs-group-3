package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.model.Album;
import org.wcci.apimastery.model.Song;
import org.wcci.apimastery.repositories.AlbumRepository;
import org.wcci.apimastery.repositories.SongRepository;

@Component
public class Populator implements CommandLineRunner {
    private AlbumRepository albumRepo;
    private SongRepository songRepo;

    public Populator(AlbumRepository albumRepo, SongRepository songRepo) {
        this.albumRepo = albumRepo;
        this.songRepo = songRepo;
    }
    @Override
    public void run(String... args) throws Exception {
        Album album1 = new Album("album","gvdgsgfeuh","tyler","src","retyd");
        albumRepo.save(album1);
        Song song1 = new Song("dsg","ydgsuyfg",album1,12);
        songRepo.save(song1);

    }
}
