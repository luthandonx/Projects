package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame m = new JFrame("Board");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(770,770);

        Board b = new Board();
        m.add(b);
        m.setVisible(true);
    }
}
