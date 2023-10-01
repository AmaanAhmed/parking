package com.spring.demo.parking.service;

import com.spring.demo.parking.model.Student;
import com.spring.demo.parking.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void save(Student student) {
        if (student.getId() == null) {
            studentRepository.save(student);
        } else {
            Student staffUpdate = studentRepository.findById(student.getId()).get();
            staffUpdate.setName(student.getName());
            staffUpdate.setRollNo(student.getRollNo());
            staffUpdate.setEmailId(student.getEmailId());
            studentRepository.save(staffUpdate);
        }
    }
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
    @Override
    public Student getById(Integer id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
