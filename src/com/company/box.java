package com.company;

public class box {
    private double width;
    private double height;
    private double depth;

    double volume() {
        return width * height * depth;
    }

    box(box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    box(double len){
        width = height = depth = len;
    }

    void print(){
        System.out.println("this " + this.width + " * " + width);

    }
    void setDim(double w, double h, double d) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

}
