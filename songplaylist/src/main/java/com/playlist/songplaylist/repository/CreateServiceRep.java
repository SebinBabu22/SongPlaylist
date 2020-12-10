package com.playlist.songplaylist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playlist.songplaylist.models.Playlist;


@Repository
public interface CreateServiceRep extends CrudRepository<Playlist, Integer> {

	
}
