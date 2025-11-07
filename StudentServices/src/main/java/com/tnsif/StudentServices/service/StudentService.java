package com.tnsif.StudentServices.service;


import java.util.List;
import com.tnsif.StudentServices.entity.Student;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student addStudent(Student s);
    Student updateStudent(int id, Student s);
    void deleteStudent(int id);
}
