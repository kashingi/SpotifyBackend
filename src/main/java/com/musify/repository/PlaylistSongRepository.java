package com.musify.repository;

import com.musify.entity.PlaylistSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Add your annotations here
@Repository
public interface PlaylistSongRepository extends JpaRepository<PlaylistSong, Long> {
}
