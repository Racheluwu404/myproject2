package com.Rachel;

public class GoldenCustomer extends SliverCustomer{
    public GoldenCustomer(){

    }
    public GoldenCustomer(String number,int cost){
        super(number,cost);
    }
    public String gift(){
        return "doll";
    }
    @Override
    public void print(){
        System.out.println(number + "\t" + cost + "\t" + discount() + "(" + point() + ")" + "You got : " +gift());
    }
}
