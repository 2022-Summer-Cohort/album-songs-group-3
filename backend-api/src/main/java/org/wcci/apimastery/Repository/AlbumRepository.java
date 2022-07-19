package org.wcci.apimastery.Repository;

import org.wcci.apimastery.Model.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AlbumRepository extends CrudRepository<Album, Long> {

    Optional<Album> findByAlbumNameIgnoreCase(String input);

}
