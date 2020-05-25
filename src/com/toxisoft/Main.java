package com.toxisoft;

public class Main {

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(20, 10);
        pyramid.buildPyramid();
        pyramid.print();
    }
}
