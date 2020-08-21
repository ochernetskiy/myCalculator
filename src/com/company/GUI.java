package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {


    public GUI() {
        setTitle("Calculator");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(4, 3));

        for (int b = 0; b < 10; b++) {
            grid.add(new JButton("" + b));
            if(b == 2) {
                JButton add = new JButton("+");
                grid.add(add);
            }
            if(b == 5) {
                JButton subtract = new JButton("-");
                grid.add(subtract);
            }
            if(b == 8) {
                JButton multiply = new JButton("*");
                grid.add(multiply);
            }
            if(b == 9) {
                JButton divide = new JButton("/");
                grid.add(divide);

                JButton equals = new JButton("=");
                grid.add(equals);
            }
        }

        getContentPane().add(grid);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }
}
