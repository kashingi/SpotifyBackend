package com.musify.repository;

import com.musify.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Add your annotations here
@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}
