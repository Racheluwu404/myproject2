package com.Rachel.sale;

public class SliverCustomer extends Customer{
    public SliverCustomer(){

    }
    public SliverCustomer(String number , int cost){
        super(number,cost);
    }

    public int point(){
        return ((cost/1000)*100);
    }

    @Override
    public void print(){
            System.out.println(number + "\t" + cost + "\t" + discount() + "(" + point() + ")");
    }
}
