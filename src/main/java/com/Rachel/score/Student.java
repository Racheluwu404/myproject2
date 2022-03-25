package com.Rachel.score;

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
    System.out.print(name + "\t" + math + "\t" +english +
            "\t" + getAverage());
    if(getAverage() <60){
      System.out.print("*");
    }
    System.out.println();
  }
  //test
  public int getAverage(){
    return (english+math)/2 ;
  }

}
