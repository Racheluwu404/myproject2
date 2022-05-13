package com.Rachel.parking;
import java.text.SimpleDateFormat;
import java.util.*;

public class Runner {
  public static void main(String[] args) {
    String id = "ABC-1234";
    String enterTime = "08:00";
    String exitTime = "09:27";
    SimpleDateFormat sdf =
      new SimpleDateFormat("HH:mm");
    Date d =null;
    try {
      d = sdf.parse(enterTime);
    }catch (Exception e){
      System.out.println("Wrong");
    }
    System.out.println(d);

    try{
      Date d2 = sdf.parse(exitTime);
      System.out.println(d2);
      long ms = d2.getTime() - d.getTime();
      int minutes = (int) ms/(1000*60);
      System.out.println(minutes);
      //NT$30/h
      int hours = (minutes+30)/60;
      //不滿15分不算錢 15-29,半小時,收15元 ,30-44 半小 45-59...

    }catch (Exception e){
      System.out.println("Exit wrong format");
    }

//    long a = 3*60*60*1000;


  }
}
