package com.playlist.songplaylist.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Playlist {
	
	
	@Id
	@Column
	Integer playlist_id;
	
	@Column
	String playlist_name;
	
	public Playlist()
    {
     super();
    }
	
	public Playlist(Integer playlist_id, String playlist_name) {
		super();
		this.playlist_id = playlist_id;
		this.playlist_name = playlist_name;
	}
	
	public Integer getPlaylist_id() {
		return playlist_id;
	}
	public void setPlaylist_id(Integer playlist_id) {
		this.playlist_id = playlist_id;
	}
	public String getPlaylist_name() {
		return playlist_name;
	}
	public void setPlaylist_name(String playlist_name) {
		this.playlist_name = playlist_name;
	}
	
	

}
