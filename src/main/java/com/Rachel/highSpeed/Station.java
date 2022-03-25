package com.Rachel.highSpeed;

public class Station {
  public static Station TAIPEI = new Station(100,"Taipei");
  public static Station TAICHUNG = new Station(200,"Taichung");
  public static Station KAOHSIUNG = new Station(300,"Kaohsiung");
  int id;
  String name;
  public Station(){ }
  public Station(int id,String name)
  {
    this.id = id;
    this.name = name;
  }
}
