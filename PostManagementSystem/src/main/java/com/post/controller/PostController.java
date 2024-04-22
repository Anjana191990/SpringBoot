package com.post.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.post.entity.Post;
import com.post.repository.PostRepository;

@RestController
@RequestMapping("/post")
public class PostController {
@Autowired
	PostRepository repo;

@PostMapping("/addpost")
public  Post createpost(@RequestBody Post p){
	return repo.save(p);
	
}

@GetMapping("/readpost")
public List<Post>fetchAllPostDetails(){
	List<Post> allpost=repo.findAll();
	return  allpost;
}

@GetMapping("/readpost/{id}")

public java.util.Optional<Post> getPostById(@PathVariable("id")int id) {

	
	return repo.findById(id) ;
}

@DeleteMapping("/deletepost/{id}")

public String deletePost(@PathVariable("id")int id) {
	if(repo.findById(id).isPresent()) {
		repo.deleteById(id);
		return "Post deleted successfully";
	}
	return "Searching Post are not available";
}
@PutMapping("/updatepost/{id}")
public Post updatepost(@PathVariable("id")int id,@RequestBody Post p){
	p.setPostId(id);

	
	return repo.save(p);
	
}

}
