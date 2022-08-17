package com.example.springstart.BackEnd;

import java.util.List;

public interface Element {
    List<Integer> getVertices();
    double[][] SourceMatrix();
    double[][] ResistanceMatrix();
}
