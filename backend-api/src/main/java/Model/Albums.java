package Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Albums {
    @Id @GeneratedValue
    private long id;

    private String albumName;
    private String recordLabel;
    private Collection<Songs> songs;



}
