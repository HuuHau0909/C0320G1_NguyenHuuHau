package com.haulaptrinh.testboot.services;

import com.haulaptrinh.testboot.models.Student;

import java.util.List;

public interface StudentService {
List<Student> getAllStudent();
Student findStudentById(int id);
void deleteStudent(int id);
void saveStudent(Student student);
}
