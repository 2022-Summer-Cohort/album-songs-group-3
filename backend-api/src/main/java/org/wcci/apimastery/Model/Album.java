package org.wcci.apimastery.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Album {
    @Id @GeneratedValue
    private long id;

    private String albumName;
    private String recordLabel;
    private int rating;
    @OneToMany (mappedBy = "Albums")
    private Collection<Song> song;



}
