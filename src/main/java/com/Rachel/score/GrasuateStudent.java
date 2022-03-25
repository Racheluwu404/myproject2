package com.Rachel.score;

import com.Rachel.score.Student;

public class GrasuateStudent extends Student {
    int thesis;
    public GrasuateStudent(){

    }
    public GrasuateStudent(String name , int english , int math , int thesis){
        super(name,english,math);
        this.thesis = thesis;
        //super(name); = this.name = name;
    }

    @Override
    public void print(){
        System.out.println(name + "\t" + math + "\t" +english +
                "\t" + getAverage() + "\t" + thesis);

        //System.out.println();
    }
}
