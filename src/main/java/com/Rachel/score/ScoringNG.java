package com.Rachel.score;

public class ScoringNG {
  public static void main(String[] args){
    int [] englishs = {70 , 60 , 80 , 93 , 78};
    int [] maths = {50 , 88 , 72 , 42 , 63};
    String [] students = {"Henry" , "Amy" , "Tommy" , "Ed" , "Lucy"};
    for(int i = 0; i<5 ; i++){
      if(i != 0){
        System.out.println(students[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + ((englishs[i] + maths[i])/2));
      }
    }

  }
}
