package com.Rachel.highSpeed;
import java.util.*;

public class User
{
  static ArrayList<String> afterChoice = new ArrayList<>();
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Station station = new Station();
    System.out.println("Please choice start Station :");
    System.out.println(station.Slist());
    afterChoice.addAll(station.Slist());
    int start = in.nextInt();
    System.out.println("Please choice destination Station :");
    afterChoice.remove(start);
    System.out.println(afterChoice);
    int end = in.nextInt();
    boolean round = false;
    System.out.println("Are you need same day return ticket? [Y/N] ");
    String r = in.next();
    if(r == "Y") {
      round = true;
    }else{
      round = false;
    }
    Ticket ticket = new Ticket(start, end ,round);
    ticket.price();


  }
}
