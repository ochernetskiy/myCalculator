package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {

    static GraphicsConfiguration gc;
    public GUI() {
        JFrame frame = new JFrame(gc);
        frame.setTitle("My First Application");
        frame.setSize(350, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("Button");
        frame.add(button);
        button.setBounds(0,0,50,50);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
