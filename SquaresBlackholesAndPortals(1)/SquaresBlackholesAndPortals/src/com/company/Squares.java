package com.company;

import java.awt.*;

public class Squares {

    private int x ;
    private int y;

    Tokens t ;

    public Squares(){

    }

    public void draw(Graphics g)
    {
        g.drawRect(700-70*this.x , 700-70*this.y , 70, 70);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
