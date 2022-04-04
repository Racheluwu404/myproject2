package com.Rachel.score;

import com.Rachel.sale.Customer;

import java.util.ArrayList;

public class Scoring {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Henry",50,30));
    students.add(new Student("Amelia",80,70));
    students.add(new GrasuateStudent("Alphy",60,70,90));
    for(Student s :students){
      s.print();
    }
  }
}
