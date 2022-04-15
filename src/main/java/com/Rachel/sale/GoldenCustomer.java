package com.Rachel.sale;

public class GoldenCustomer extends SliverCustomer{
    int bouns;
    public GoldenCustomer(){

    }
    public GoldenCustomer(String number,int cost){
        super(number,cost);
    }

    @Override
    public int discount(){
        return (int) (cost*feeback*9);
    }

    @Override
    public int point(){
        return (int)(cost*0.1);
    }

    @Override
    public void print(){
        System.out.println(number + "\t" + cost + "\t" + discount() + "(" + point() + ")" );
    }
}
