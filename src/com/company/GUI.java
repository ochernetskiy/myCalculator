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

        GridLayout layout = new GridLayout(4, 4, 5, 5);
        grid.setLayout(layout);

        for (int b = 0; b < 10; b++) {
            grid.add(new JButton("Num" + b));
        }

        getContentPane().add(grid);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }
}
