package com.Rachel.highSpeed;

public class Ticket {
  Station start;
  Station destination;
  int amount;
  public Ticket(){  }

  public Ticket(Station start, Station destination, int amount)
  {
    this.amount = amount;
    this.start = start;
    this.destination = destination;
  }




}
