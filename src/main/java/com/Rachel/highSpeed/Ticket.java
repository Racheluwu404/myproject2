package com.Rachel.highSpeed;
import java.util.*;
public class Ticket {
  int start;
  int end;
  boolean round;
  int amount;
  public Ticket(){  }

  public Ticket(int start, int end, boolean round)
  {
    this.start = start;
    this.end = end;
    this.round = round;

  }

  public int price(){
    if(start == 0) {
      if(end == 1) {
        amount = 1500;
      } else {
        amount = 600;
      }
    }else if(start == 1){
      if(end == 0){
        amount = 1500;
      }else{
        amount = 900;
      }
    }else{
      if(end == 0){
        amount = 600;
      }else{
        amount = 900;
      }
    }
    return amount;

    /*if(round == true){
      amount = (int)(amount*2*0.9);
      return amount;
    }else{

    }*/

  }



}
