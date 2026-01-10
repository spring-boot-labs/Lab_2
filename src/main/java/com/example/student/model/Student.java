package com.example.student.model;

public class Student {
  private int id;
  private String name;
  private int age;
  private String email;

  public Student(int id, String name, int age,String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email=email;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
  public String getEmai(){
    return this.email;
  }
}
