package com.spring.demo.parking.repository;

import com.spring.demo.parking.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
