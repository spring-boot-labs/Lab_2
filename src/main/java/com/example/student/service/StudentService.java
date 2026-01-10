package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {
  @Autowired
  private StudentRepository repository;
  public List<Student>getAllStudent(){
    return repository.findAll();
  }
}
