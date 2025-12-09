package com.vcube.app02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.app02.model.Student;
import com.vcube.app02.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	StudentRepo studentRepo;

	@PostMapping("/insert")
	Student insertStudent(@RequestBody Student s) {
		return studentRepo.save(s);
	}

	@GetMapping("/getStudent")
	List<Student> getStudents() {
		return studentRepo.findAll();
	}

}
