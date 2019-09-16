package com.defectTracker.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defectTracker.project.model.Project;

@Repository
public interface ProjectRepostories extends JpaRepository<Project, Long> {

}
