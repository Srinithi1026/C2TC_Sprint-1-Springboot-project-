package com.tnsif.StudentServices.repository;

import com.tnsif.StudentServices.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
// Inherits: findAll(), save(), findById(), deleteById() etc.
}