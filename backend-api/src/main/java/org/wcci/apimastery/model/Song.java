package org.wcci.apimastery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Song {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String artist;
    private String duration;

    @ManyToOne
    @JsonIgnore
    private Album albums;

    @ElementCollection
    private Collection<String> comments;

    public Song(String name, String artist, Album albums, String duration) {
        this.name = name;
        this.artist = artist;
        this.albums = albums;
        this.duration = duration;
    }

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public Album getAlbums() {
        return albums;
    }

    public Collection<String> getComments() {
        return comments;
    }
}
