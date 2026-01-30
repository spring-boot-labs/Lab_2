package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {

  @Autowired
  private StudentService studentService;
  @GetMapping("")
  public String listStudents(Model model){
    List<Student>students=studentService.getAllStudent();
    model.addAttribute("students",students);
    return "listStudent";
  }
  @GetMapping("/create")
  public String createForm(){
      return "create";

  }
  
  @PostMapping("/create")
  public String create(Student student) {
  studentService.createStudent(student);
    return "redirect:/";
  }


  @GetMapping("/edit/{id}")
  public String editForm(@PathVariable int id, Model model) {
    model.addAttribute("student", studentService.findOne(id));
    return "edit";
  }

  @PostMapping("/edit/{id}")
  public String update(@PathVariable int id, Student student) {
    studentService.updateStudent(id, student);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable int id) {
    studentService.DeleteStudent(id);
    return "redirect:/";
  }
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

