package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;
  @GetMapping("/students")
  public String listStudents(Model model){
    List<Student>students=studentService.getAllStudent();
    model.addAttribute("students",students);
    return "students";
  }

























  // @GetMapping("/hello")
  // public String hello(){
  //   return "Hello";
  // }
  // @GetMapping("/greet")
  // public String greet(@RequestParam String name){
  //   return  "Hello"+name;
  // }
  // @GetMapping("/students")
  // public Student getStudents(){
  //   return new Student (1,"Hoang",18);
  // }
  // @GetMapping("/students/{id}")
  // public String getStudent(@PathVariable int id){
  //   return "Sinh vien co ma id la " + id;
  // }
  // @GetMapping("/student")
  // public List<Student>getListStudent(){
  //   List<Student>list = new ArrayList<>();
  //   list.add(new Student(1, "Huy", 18));
  //   list.add(new Student(2, "Hai", 11));
  //   list.add(new Student(3, "Hieu", 12));
  //   return list;
  // }
}
