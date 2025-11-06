package com.tnsif.StudentServices.entity;
import com.tnsif.StudentServices.entity.Student;



import jakarta.persistence.*;
@Column(name = "name", nullable = false)
private String name; // 2️⃣


@Email
@NotBlank
@Column(name = "email", unique = true, nullable = false)
private String email; // 3️⃣


@NotBlank
@Column(name = "phone", length = 15)
private String phone; // 4️⃣


@NotBlank
@Column(name = "department")
private String department; // 5️⃣


@Min(1) @Max(4)
@Column(name = "year_of_study")
private Integer year; // 6️⃣


@DecimalMin("0.0") @DecimalMax("10.0")
@Column(name = "cgpa")
private Double cgpa; // 7️⃣


public Student() {}


public Student(Long studentId, String name, String email, String phone, String department, Integer year, Double cgpa) {
this.studentId = studentId;
this.name = name;
this.email = email;
this.phone = phone;
this.department = department;
this.year = year;
this.cgpa = cgpa;
}


public Long getStudentId() { return studentId; }
public void setStudentId(Long studentId) { this.studentId = studentId; }


public String getName() { return name; }
public void setName(String name) { this.name = name; }


public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }


public String getPhone() { return phone; }
public void setPhone(String phone) { this.phone = phone; }


public String getDepartment() { return department; }
public void setDepartment(String department) { this.department = department; }


public Integer getYear() { return year; }
public void setYear(Integer year) { this.year = year; }


public Double getCgpa() { return cgpa; }
public void setCgpa(Double cgpa) { this.cgpa = cgpa; }


@Override
public String toString() {
return "Student{" +
"studentId=" + studentId +
", name='" + name + '\'' +
", email='" + email + '\'' +
", phone='" + phone + '\'' +
", department='" + department + '\'' +
", year=" + year +
", cgpa=" + cgpa +
'}';
}