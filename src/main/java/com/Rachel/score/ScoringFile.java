package com.Rachel.score;

import com.Rachel.sale.Customer;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ScoringFile {
  public static void main(String[] args) {
    try{
      FileReader fileReader = new FileReader("scores.txt");
    }catch(FileNotFoundException ex){
      System.out.println("檔案讀取失敗");
    }
    System.out.println("Continuing");
  }
}
