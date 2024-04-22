package com.eb.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eb.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
