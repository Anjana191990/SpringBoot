package com.eb.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.user.exception.UserResource;
import com.eb.user.model.User;
import com.eb.user.repository.UserRepository;




@Service
public class UserServiceImpl implements UserService {

	@Autowired
	
	UserRepository repo;
	
	
	@Override
	public User createUser(User u) {
		
		return repo.save(u);
	}

	@Override
	public User updateUser(User u) {
		
		Optional<User>user=repo.findById(u.getId());
		if(user.isPresent()) {
			User updateUser=user.get();
			updateUser.setId(u.getId());
			updateUser.setFirstName(u.getFirstName());
			updateUser.setLastName(u.getLastName());
			updateUser.setUsername(u.getUsername());
			updateUser.setPassword(u.getPassword());
			repo.save(updateUser);
			return updateUser;
			
		}else {
			throw new UserResource("Searching id not available");
		}
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User getUserById(int id) {
		
		Optional<User>user=repo.findById(id);
		if(user.isPresent()) {
			return user.get();		
			}
		else {
			throw new UserResource("Searching id not available");
		}
	}

	@Override
	public String deleteUser(int id) {
		
		Optional<User>user=repo.findById(id);
		if(user.isPresent()) {
			repo.delete(user.get());		
			}
		else {
			throw new UserResource("Searching id not available");
		}
		return "id deleted ";
	}

}
