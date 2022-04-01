package com.Rachel.highSpeed;

import java.util.*;
public class User
{
  static ArrayList<String> stationList = new ArrayList();
  public static void main(String[] args)
  {
    Ticket ticket = new Ticket(Station.TAIPEI, Station.KAOHSIUNG, 1);
    stationList.add("Taipei");
    stationList.add("Kaohsiung");
    stationList.add("Taichung");
    Scanner in = new Scanner(System.in);
    List<String> afterChoice = new ArrayList<>();
    System.out.println("Please choice start Station :");
    System.out.println(stationList);
    int start =in.nextInt();
    System.out.println("Please choice destination Station :");
    afterChoice.addAll(stationList);
    afterChoice.remove(start);
    System.out.println(afterChoice);
    int end = in.nextInt();

  }
}
