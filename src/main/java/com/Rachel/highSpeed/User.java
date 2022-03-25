package com.Rachel.highSpeed;

import java.util.*;
public class User
{
  static ArrayList<String> a= new ArrayList<String>();
  a.add("Taipei","Taichung","Kaohsiung");
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Ticket ticket = new Ticket(Station.TAIPEI, Station.KAOHSIUNG, 1);
    System.out.println("Please choice start Station :");
    System.out.println(a);
    int start =in.nextInt();
    System.out.println("Please choice destination Station :");
    System.out.println(a.remove(start));
  }
}
