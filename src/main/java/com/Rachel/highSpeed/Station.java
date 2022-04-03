package com.Rachel.highSpeed;
import java.util.*;

public class Station
{
  public Station()
  {
  }
  Scanner in = new Scanner(System.in);
  static ArrayList<String> stationList = new ArrayList();
  static ArrayList<String> afterChoice = new ArrayList<>();

  public void Print(){
    stationList.add("0 : Taipei");
    stationList.add("1 : Kaohsiung");
    stationList.add("2 : Taichung");
    System.out.println("Please choice start Station :");
    System.out.println(stationList);
    int start = 1; //in.nextInt();
    System.out.println("Please choice destination Station :");
    afterChoice.addAll(stationList);
    afterChoice.remove(start);
    System.out.println(afterChoice);
    int end = 2; //in.nextInt();
    boolean round = true;
    System.out.println("Are you need same day return ticket? [Y/N] ");
    //String r = in.next();
    /*if(r == "Y"){
      round = true;
    }*/
  }


}
