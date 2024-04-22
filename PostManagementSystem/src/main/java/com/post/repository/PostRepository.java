package com.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.entity.Post;

public interface PostRepository  extends JpaRepository<Post,Integer>{

	//List<Post>findByPublished(boolean published);
	
	//List<Post>findByPostTitle(String postName);
	
}
