package com.tnsif.StudentServices.controller;

import com.tnsif.StudentServices.entity.Student;
import com.tnsif.StudentServices.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {


private final StudentService service;


public StudentController(StudentService service) {
this.service = service;
}


// GET All
@GetMapping
public List<Student> getAll() {
return service.listAll();
}


// GET One
@GetMapping("/{id}")
public