package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.bind.JAXBPermission;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Dice extends JPanel {

    Random rand  = new Random();
    private int num;
    Image pic;

    public Dice(){
        num = rand.nextInt(6)+1;
    }

    public void Roll () throws IOException {
        pic = ImageIO.read(new File("C:\\Users\\Luthando\\Desktop\\SquaresBlackholesAndPortals\\Dice\\dice"+num+".png"));
        //repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(pic ,0 , 0 , null);
    }
}
