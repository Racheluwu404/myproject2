package com.Rachel.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
  public static void main(String[] args){
    JFrame frame = new JFrame();
    JButton button = new JButton("OK");
    frame.setSize(800,600);//視窗大小
    frame.setLocation(200,200);//視窗位置
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//X即結束程式
    //MyActionListener Listener = new MyActionListener();//ActionListener是已經建好的interface
    //button.addActionListener(Listener);//有名字的類別 需實作類別實現方法
    //匿名類別 anonymous
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("tf");
      }
    });
    //frame.setLayout(new BorderLayout());//預設 依東南西北分區 沒指定依中間為主 元件大小會受影響
    frame.setLayout(new FlowLayout());//設定元件位置(流水式設置 不會影響元件原先大小 X軸不夠放會往下放)
    frame.add(button);
    frame.setVisible(true);



  }

}
