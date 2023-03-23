package jp.teav.teavbackend.users.model;

import java.security.Timestamp;

import lombok.Data;

@Data
public class Users {

	private int id;
	
	private String name;
	
	private String overview;
	
	private int leader_id;
	
	private boolean is_wanted;
	
	private Timestamp created_at;
	
	private Timestamp updated_at; 
	
	
	
}
