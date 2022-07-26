package org.wcci.apimastery.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;

    private String content;

    private int rating;

    @ManyToOne
    private Album albums;

    public Review(String content, int rating, Album albums) {
        this.content = content;
        this.rating = rating;
        this.albums = albums;
    }

    public Review() {
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getRating() {
        return rating;
    }

    public Album getAlbums() {
        return albums;
    }
}
