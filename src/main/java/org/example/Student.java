package org.example;

public class Student {

  String name;
  int age;
  double grade;

  public Student(String name,int age,double grade){
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public void printInfo() {
    System.out.println("名前：" + name);
    System.out.println("年齢：" + age);
    System.out.println("成績：" + grade);
  }

  public void isPassed() {
    if (grade >= 60.0) {
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }
  }
}
