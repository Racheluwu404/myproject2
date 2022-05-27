package com.Rachel.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
  JButton button = new JButton();
  public GuessFrame(){
    super();//一定要在建構子第一行 呼叫JFrame父類別方法
    setSize(600,400);
    setLocation(200,300);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
    JButton button = new JButton("Hello");
    JLabel label = new JLabel("zzz");//文字標籤
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        label.setText("HI");
      }
    });
    setLayout(new FlowLayout());
    add(label);
    add(button);

  }

  public static void main(String[] args) {
    GuessFrame guessFrame = new GuessFrame();


  }
}
