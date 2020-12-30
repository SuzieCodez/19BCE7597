package com.company;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class radioButton {
    JFrame jf;
    radioButton(){
        jf=new JFrame("Radio Button");
        JRadioButton r1=new JRadioButton("Chocolate");
        JRadioButton r2=new JRadioButton("Chips");
        r1.setBounds(5,50,100,30);
        r2.setBounds(5,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        jf.add(r1);
        jf.add(r2);
        jf.setSize(300,300);
        //Most imp line to be included 
        jf.setLayout(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
       new radioButton();
    }
}

