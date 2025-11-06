package com.tnsif.StudentServices.service;

import com.tnsif.StudentServices.entity.Student;

import com.tnsif.StudentServices.repository.StudentRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


private final StudentRepository repo;


public StudentServiceImpl(StudentRepository repo) {
this.repo = repo;
}


@Override
public List<Student> listAll() {
return repo.findAll();
}


@Override
public Student getById(Long id) {
return repo.findById(id)
.orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
}


@Override
public Student create(Student student) {
student.setStudentId(null); // ensure insert
return repo.save(student);
}


@Override
public Student update(Long id, Student student) {
Student existing = getById(id);
existing.setName(student.getName());
existing.setEmail(student.getEmail());
existing.setPhone(student.getPhone());
existing.setDepartment(student.getDepartment());
existing.setYear(student.getYear());
existing.setCgpa(student.getCgpa());
return repo.save(existing);
}


@Override
public void deleteById(Long id) {
repo.deleteById(id);
}
}