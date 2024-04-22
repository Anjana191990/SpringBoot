package com.eb.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eb.user.model.User;
import com.eb.user.service.UserService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	UserService service;
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public User createUser(@RequestBody User user) {
	
		return service.createUser(user);
		
	}
	@PutMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public User updateUser(@PathVariable ("id")int id,@RequestBody User u) {
		u.setId(id);
		return service.updateUser(u);
		
	}
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<User> getAllUser() 
	{
		return service.getAllUser();
	}
	@DeleteMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)

	public String deleteUser (@PathVariable("id")int id) 
 
	{
		return service.deleteUser(id);
		
	}
	@GetMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public User getUserById(@PathVariable("id")int id)
	{
		return service.getUserById(id);
		
	}
}
