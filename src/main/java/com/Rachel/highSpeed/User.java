package com.Rachel.highSpeed;
import java.util.*;

public class User
{
  public static void main(String[] args)
  {
    Ticket ticket = new Ticket();
    Station station = new Station();
    station.Print();
    System.out.println("total price :" + ticket.price());

  }
}
