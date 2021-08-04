package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Tokens {

    Image pic;
    private int x;
    private int y;
    public Tokens(){
        this.x = 0;
        this.y = 0;
    }

    public void draw(Graphics g , int x , int y) throws IOException
    {
        pic = ImageIO.read(new File("C:\\Users\\Luthando\\Desktop\\SquaresBlackholesAndPortals\\PortalsAndBlackHoles\\token.png"));
        g.drawImage(pic , x ,y , null);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
