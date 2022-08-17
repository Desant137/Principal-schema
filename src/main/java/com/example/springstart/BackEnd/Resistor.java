package com.example.springstart.BackEnd;

import java.util.List;

public class Resistor implements Element{

    public String name;
    public double resistance;
    List<Integer> vertices;

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
        double[][] r = new double[1][1];
        r[0][0] = resistance;
        return r;
    }
}
