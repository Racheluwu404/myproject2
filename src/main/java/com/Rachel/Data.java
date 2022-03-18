package com.Rachel;

public class Data {
    public static void main(String[] args) {
        Customer Aries = new Customer("001",1200);
        Aries.print();
        SliverCustomer Hans = new SliverCustomer("002",4200);
        Hans.print();
        GoldenCustomer Bill = new GoldenCustomer("003",65000);
        Bill.print();
    }
}
