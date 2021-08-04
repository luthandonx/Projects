package com.company;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Tokens t;
    Dice d;


    public Board(){

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for  (int r = 1 ; r <= 10 ; r++)
        {
            for (int c= 1 ; c<= 10;c++)
            {
                Squares s = new Squares();
                s.setY(r);
                s.setX(c);
                s.draw(g);
                s = null;
            }
        }
    }
}
