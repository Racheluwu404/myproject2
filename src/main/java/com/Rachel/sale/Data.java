package com.Rachel.sale;

import java.util.ArrayList;

public class Data {
    public static void main(String[] args) {
        ArrayList <Customer> customers = new ArrayList<>();
        customers.add(new Customer("001",1200));
        customers.add(new SliverCustomer("002",4200));
        customers.add(new Customer("005",800));
        customers.add(new GoldenCustomer("003",6500));
        customers.add(new Customer("008",2000));
        customers.add(new PlatinumCustomer("004",8000));
        for(Customer c :customers){
            c.print();
        }
    }
}
