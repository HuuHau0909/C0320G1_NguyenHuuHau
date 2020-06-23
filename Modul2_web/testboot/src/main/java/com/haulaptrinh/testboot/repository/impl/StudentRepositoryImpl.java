package com.haulaptrinh.testboot.repository.impl;

import com.haulaptrinh.testboot.models.Student;
import com.haulaptrinh.testboot.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Integer, Student> listStudent;

    static {
        listStudent = new HashMap<>();
        listStudent.put(1, new Student(1, "Cuong", "cuong@gmail.com"));
        listStudent.put(2, new Student(2, "Tu", "Tu@gmail.com"));
        listStudent.put(3, new Student(3, "Thao", "Thao@gmail.com"));
        listStudent.put(4, new Student(4, "Ngoc", "Ngoc@gmail.com"));
        listStudent.put(5, new Student(5, "Hau", "Hau@gmail.com"));
        listStudent.put(6, new Student(6, "Bao", "Bao@gmail.com"));
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(listStudent.values());
    }

    @Override
    public Student getById(int id) {
        return listStudent.get(id);
    }

    @Override
    public void deleteById(int id) {
        listStudent.remove(id);
    }

    @Override
    public void save(Student student) {
        listStudent.put(student.getId(), student);
    }
}
