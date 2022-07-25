package org.wcci.apimastery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String artist;
    private String imgUrl;
    private String label;
    @OneToMany(mappedBy = "albums", cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<Song> songs;

    public Album(String name, String artist, String description, String imgUrl, String label) {
        this.name = name;
        this.description = description;
        this.artist = artist;
        this.label = label;
        this.imgUrl = imgUrl;
    }

    public Album() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getArtist() {
        return artist;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLabel() {
        return label;
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
