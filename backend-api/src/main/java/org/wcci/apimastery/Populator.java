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

        Album album1 = new Album("Album1","Tyler0",
                "Bacon ipsum dolor amet short loin tail pork loin salami shoulder fatback doner flank chicken brisket meatball jerky.",
                "https://picsum.photos/200/200?random=1","Album label");
        Album album2 = new Album("Album2","Tyler1","Chicken swine short ribs, t-bone bacon hamburger andouille pastrami rump capicola alcatra picanha.",
                "https://picsum.photos/200/200?random=2","Album label2");
        Album album3 = new Album("Album3","Tyler2","Meatball ham venison buffalo chislic kevin jowl shank pastrami burgdoggen cow brisket pork chop bacon salami.",
                "https://picsum.photos/200/200?random=3","Album label3");
        Album album4 = new Album("Album4","Tyler3"," Meatball turkey beef venison jowl shank flank bacon fatback chicken ham strip steak picanha short loin salami.",
                "https://picsum.photos/200/200?random=4","Album label4");

        albumRepo.save(album1);
        albumRepo.save(album2);
        albumRepo.save(album3);
        albumRepo.save(album4);

        Song song1 = new Song("Song1","Tyler",album1,12);
        songRepo.save(song1);

    }
}
