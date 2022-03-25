package com.Rachel.score;

public class Scoring {
  public static void main(String[] args) {
    Student Henry = new Student("Henry");
    Henry.english = 50;
    Henry.math = 30;
    Henry.print();
    Student Amelia = new Student("Amelia",80,70);
    Amelia.print();
    GrasuateStudent Alphy = new GrasuateStudent("Alphy",60,70,90);
    Alphy.print();
  }
}
