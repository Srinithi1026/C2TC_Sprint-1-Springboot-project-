package com.tnsif.StudentServices.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.StudentServices.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // findAll(), save(), findById(), deleteById() inherited automatically
}
