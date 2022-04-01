package com.Rachel.sale;

public class PlatinumCustomer extends GoldenCustomer{
  public PlatinumCustomer(){
  }
  public PlatinumCustomer(String number,int cost){
    super(number,cost);
  }

  @Override
  public int discount() {
    return (int) (cost*feeback*7);
  }

  @Override
  public int point() {
    return (int) (cost*0.2);
  }
}
