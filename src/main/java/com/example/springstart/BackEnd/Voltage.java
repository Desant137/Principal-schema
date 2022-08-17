package com.example.springstart.BackEnd;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Voltage extends JLabel implements Element {
    Image elementImage = new ImageIcon("Icons/voltage.png").getImage();
    public String name;
    public double voltage;
    List<Integer> vertices;
    public int radius = 19;

    public Voltage(String name){
        this.name = name;

        this.setSize(2*radius, 2*radius);
        elementImage = elementImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
        this.setIcon(new ImageIcon(elementImage));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Integer> getVertices() {
        return null;
    }

    @Override
    public double[][] SourceMatrix() {
        return new double[0][];
    }

    @Override
    public double[][] ResistanceMatrix() {
        return new double[0][];
    }
}