package com.company;

// Java program Program to add a menubar using Panel
// and add menu items, submenu items and also add
// ActionListener to menu items

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panelMenu extends JFrame implements ActionListener/*, KeyListener*/ {
    // menubar
    static JMenuBar mb;
    // JMenu
    static JMenu fru,veg,shop;
    // Menu items
    static JMenuItem m1, m2, m3, m4, m5;
    // create a frame
    static JFrame f;
    // a label
    static JLabel l;
    //a panel
    static JPanel jp;
    // main class
    public static void main(String[] args) {
// create an object of the class
        panelMenu m = new panelMenu();
// create a frame
        f = new JFrame("Menu demo");
// create a label
        l = new JLabel("no task ");
// create a menubar
        mb = new JMenuBar();
// create a menu
        shop = new JMenu("Shopping List");
        fru = new JMenu("Fruits");
        veg = new JMenu("Veggies");
//set Mnemonics
        shop.setMnemonic('s');
        fru.setMnemonic('f');
        veg.setMnemonic('v');
// create menu items
        m1 = new JMenuItem("Orange");
        m2 = new JMenuItem("Strawberry");
        m3 = new JMenuItem("Pineapple");
        m4 = new JMenuItem("Potato");
        m5 = new JMenuItem("Zucchini");

// add ActionListener to menuItems
        m1.addActionListener(m);
        m2.addActionListener(m);
        m3.addActionListener(m);
        m4.addActionListener(m);
        m5.addActionListener(m);
//add KeyListener to menuItems
      /*  m1.addKeyListener(m);
        m2.addKeyListener(m);
        m3.addKeyListener(m);
        m4.addKeyListener(m);
        m5.addKeyListener(m);*/

        // add menu items to menu
        fru.add(m1);
        fru.add(m2);
        fru.add(m3);
        veg.add(m4);
        veg.add(m5);
// add submenu
        shop.add(fru);
        shop.add(veg);
// add menu to menu bar
        mb.add(shop);
//to create an panel
        jp = new JPanel();
//To add menu bar, layout to panel and modify the color of the panel
        jp.setBackground(Color.PINK);
        jp.setLayout(new GridLayout(2,1));
        jp.add(mb);
        // add label
        jp.add(l);
        //add menubar to frame
        f.add(jp);

// set the size of the frame
        f.setSize(500, 500);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
// set the label to the menuItem that is selected
        l.setText(s + " selected");
    }

/*    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }*/
}