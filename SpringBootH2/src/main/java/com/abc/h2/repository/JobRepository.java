package com.abc.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.h2.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
