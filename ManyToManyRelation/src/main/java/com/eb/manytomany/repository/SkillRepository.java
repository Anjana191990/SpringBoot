package com.eb.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.manytomany.model.Skills;

public interface SkillRepository extends JpaRepository<Skills, Long> {
Skills findBySkillName(String string);

}
