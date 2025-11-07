package com.tnsif.StudentServices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;   // 1

    @Column(name = "name")
    private String name;     // 2

    @Column(name = "email")
    private String email;    // 3

    @Column(name = "phone")
    private String phone;    // 4

    @Column(name = "department")
    private String department;   // 5

    @Column(name = "year")
    private int year;        // 6

    @Column(name = "cgpa")
    private double cgpa;     // 7

    public Student() {}

    public Student(int studentId, String name, String email, String phone,
                   String department, int year, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.year = year;
        this.cgpa = cgpa;
    }

    // Getters & Setters  
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
}
