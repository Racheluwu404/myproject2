package com.Rachel.highSpeed;
import java.util.*;
public class Ticket {
  int start;
  int end;
  boolean round;
  int amount;
  public Ticket(){
  }

  public Ticket(int start, int end, boolean round)
  {
    this.start = start;
    this.end = end;
    this.round = round;
  }

  public void price(){

    if(start == 0) {
      if(end == 1) {
        amount = 1100;
      } else {
        amount = 500;
      }
    }else if(start == 1){
      if(end == 0){
        amount = 1100;
      }else{
        amount = 600;
      }
    }else{
      if(end == 0){
        amount = 500;
      }else{
        amount = 600;
      }
    }


    if(round == true) {
      amount = (int) (amount * 2 * 0.9);
    }

    System.out.println("total price :" + amount);

  }



}
