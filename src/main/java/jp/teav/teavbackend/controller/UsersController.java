package jp.teav.teavbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.teav.teavbackend.model.Users;
import jp.teav.teavbackend.service.UsersService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

	@Autowired
	private final UsersService usersService;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/")
	public ResponseEntity<List<Users>> selectAll() {
		 List<Users> users = usersService.findAll(); 
		 return ResponseEntity.ok(users);
	}
 
}
