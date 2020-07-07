package com.haulaptrinh.testboot.services.impl;

import com.haulaptrinh.testboot.models.Student;
import com.haulaptrinh.testboot.repository.StudentRepository;
import com.haulaptrinh.testboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return new ArrayList<>(studentRepository.getAll());
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.getById(id);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
