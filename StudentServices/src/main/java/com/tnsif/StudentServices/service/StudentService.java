package com.tnsif.StudentServices.service;
import com.tnsif.StudentServices.entity.Student;

import java.util.List;


public interface StudentService {
List<Student> listAll(); // findAll()
Student getById(Long id); // findById()
Student create(Student student); // save() – insert
Student update(Long id, Student student);// save() – update
void deleteById(Long id); // deleteById()
}
