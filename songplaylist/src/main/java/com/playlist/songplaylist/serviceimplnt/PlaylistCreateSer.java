package com.playlist.songplaylist.serviceimplnt;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playlist.songplaylist.models.Playlist;
import com.playlist.songplaylist.repository.CreateServiceRep;

import com.playlist.songplaylist.services.PlaylistCreate;




@Service("PlaylistCreateSer")
public class PlaylistCreateSer implements PlaylistCreate {
	
	@Autowired
	CreateServiceRep servRepo;
	
	
	@Override
	public String createPlaylist(Playlist name) {
		// TODO Auto-generated method stub
		System.out.println("name id = "+name.getPlaylist_id());
		System.out.println("name= "+name.getPlaylist_name());
		
		
		
		servRepo.save(name);
		
		
		return null;
	}
	
	

}
