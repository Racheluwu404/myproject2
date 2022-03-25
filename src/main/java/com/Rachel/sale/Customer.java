package com.Rachel.sale;

public class Customer {
    String number;
    int cost;
    float feeback;
    public Customer(){

    }
    public Customer(String number,int cost){
        this.number = number;
        this.cost = cost;
        feeback = 0.1f;
    }
    public int discount(){
        return (int) (cost - feeback*1000);
    }
    public void print(){
        if(cost>=1000){
            System.out.println(number + "\t" + cost + "\t" + discount());
        }

    }

}
