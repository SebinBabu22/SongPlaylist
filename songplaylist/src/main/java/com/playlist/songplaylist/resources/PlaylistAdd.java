package com.playlist.songplaylist.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.playlist.songplaylist.models.Playlist;
import com.playlist.songplaylist.serviceimplnt.PlaylistCreateSer;



@RestController
@RequestMapping("/Playlist")
public class PlaylistAdd {
	
	//@Autowired
	//private Playlist plylist;
	
	@GetMapping("Add/{name}")
	public String addPlaylist(@PathVariable("name") String name1)
	{
		
		Playlist plist = new Playlist();
		PlaylistCreateSer plyserv = new PlaylistCreateSer();
		
		plist.setPlaylist_id(1);
		plist.setPlaylist_name(name1);
		
		plyserv.createPlaylist(plist);
		
		//String name="sebin";
		return name1;
	}
	
	/*@DeleteMapping("/DeletePly/{name}")
	public String deletePlaylist(@PathVariable("name") String name)
	{
		PlaylistCreateSer plyserv = new PlaylistCreateSer();
		
		plyserv.DeletePlaylist(name);
		return name;
		
	}
	
	@GetMapping("/GetPly/{id}")
	public Playlist getPlaylist(@PathVariable("id") int id)
	{
		PlaylistCreateSer plyserv = new PlaylistCreateSer();
		
		Optional<Playlist> ply = plyserv.GetPlaylist(id);
		return ply.get();
		
	}*/

}
