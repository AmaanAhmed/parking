package com.spring.demo.parking.service;

import com.spring.demo.parking.model.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    List<Student> getAll();
    Student getById(Integer id);
    void delete(Student student);
}
