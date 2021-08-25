package com.company;

public class box {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }

    box(double width, double height, double depth) {
        System.out.println(this.width + " * " + width);
        this.width = 10;
        this.height = 10;
        this.depth = 10;
        System.out.println(this.width + " * " + width);
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
