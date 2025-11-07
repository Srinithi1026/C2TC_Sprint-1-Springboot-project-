package com.tnsif.StudentServices.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.StudentServices.entity.Student;
import com.tnsif.StudentServices.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public Student addStudent(Student s) {
        return repo.save(s);
    }

    @Override
    public Student updateStudent(int id, Student s) {
        Student existing = getStudentById(id);
        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        existing.setPhone(s.getPhone());
        existing.setDepartment(s.getDepartment());
        existing.setYear(s.getYear());
        existing.setCgpa(s.getCgpa());
        return repo.save(existing);
    }

    @Override
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
