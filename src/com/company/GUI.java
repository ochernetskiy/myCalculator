package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {

    static GraphicsConfiguration gc;
    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.setTitle("My First Application");
        frame.setSize(350, 500);
        frame.setVisible(true);
    }
}
