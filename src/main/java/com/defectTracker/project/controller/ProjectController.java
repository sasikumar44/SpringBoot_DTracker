package com.defectTracker.project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defectTracker.project.model.Project;
import com.defectTracker.project.repository.ProjectRepostories;


@RestController
@RequestMapping("/api/v1")
public class ProjectController {
	@Autowired
	ProjectRepostories projectRepostories;

	@PostMapping(value = "/project")
	public ResponseEntity<?> createNote(@RequestBody Project project) {
		projectRepostories.save(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@GetMapping("/project")
	  public List<Project> getproject() {
		return projectRepostories.findAll();

	}
	
}
