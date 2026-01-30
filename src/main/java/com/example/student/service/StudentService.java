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

  // Doc All
  public List<Student> getAllStudent() {
    return repository.findAll();
  }

  // Create
  public Student createStudent(Student student) {
    return repository.save(student);
  }

  // find one
  public Student findOne(int id) {
    return repository.findById(id).orElse(null);
  }

  // update
  public Student updateStudent(int id, Student data) {
    Student oldStudent = this.findOne(id);
    if (oldStudent == null) {
      return null;
    }
    oldStudent.setName(data.getName());
    oldStudent.setAge(data.getAge());
    oldStudent.setEmail(data.getEmail());
    return repository.save(oldStudent);
  }
  //delete
  public void DeleteStudent(int id){
    Student olStudent = this.findOne(id);
    if(olStudent==null){
      System.out.println("Ko tim thay sinh vien");
    }
    repository.delete(olStudent);
  }
}
