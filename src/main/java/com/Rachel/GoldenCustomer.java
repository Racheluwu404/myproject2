package com.Rachel;

public class GoldenCustomer extends SliverCustomer{
    public GoldenCustomer(){

    }
    public GoldenCustomer(String number,int cost){
        super(number,cost);
    }
    @Override
    public int discount(){
        return (int) (cost - feeback*100000);
    }
    @Override
    public void print(){
        System.out.println(number + "\t" + cost + "\t" + discount() + "(" + point() + ")" );
    }
}
