package com.Rachel;

public class Student {
  int english;
  int math;
  String name;

  public Student(){//Default constructor

  }

  public Student(String name ){//constructor
    this.name = name;
  }

  public Student(String name ,int english ,int math){//constructor
    this(name);
    //this(name); = this.name = name;
    this.math = math;
    this.english = english;
  }

  public void print(){
    int average = (english+math)/2 ;
    System.out.print(name + "\t" + math + "\t" +english +
            "\t" + (english+math)/2);
    if(average <60){
      System.out.print("*");
    }
    System.out.println();
  }

}
