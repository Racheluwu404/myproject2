package com.Rachel.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
  JButton button = new JButton();
  JTextField number = new JTextField(10);
  public GuessFrame(){
    super();//一定要在建構子第一行 呼叫JFrame父類別方法
    setSize(600,400);
    setLocation(200,300);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
    JButton button = new JButton("Hello");
    JLabel labelf = new JLabel("guess number 0-1000");
    JLabel label = new JLabel();//文字標籤
    int answer = (int) (Math.random()*1000);
    System.out.println(answer);
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        int num = Integer.parseInt(number.getText());
        if(num > answer){
          label.setText("smaller");
        }else if(num < answer){
          label.setText("bigger");
        }else{
          label.setText("BINGO!! the answer is "+String.valueOf(num));
        }

      }
    });
    setLayout(new FlowLayout());
    add(labelf);
    add(number);
    add(button);
    add(label);

  }

  public static void main(String[] args) {
    GuessFrame guessFrame = new GuessFrame();


  }
}
