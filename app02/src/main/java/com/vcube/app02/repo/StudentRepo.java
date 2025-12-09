package com.vcube.app02.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.app02.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
