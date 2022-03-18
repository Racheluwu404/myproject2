package com.Rachel;

public class GrasuateStudent extends Student{
    int thesis;
    public GrasuateStudent(){

    }
    public GrasuateStudent(String name , int english , int math , int thesis){
        super(name,english,math);
        this.thesis = thesis;
        //super(name); = this.name = name;
    }

    public void print(){
        System.out.println(name + "\t" + math + "\t" +english +
                "\t" + getAverage() + "\t" + thesis);

        //System.out.println();
    }
}
