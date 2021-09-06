package com.company;

public class B extends A {
    int i;
    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("The var is name i in super class equal " + super.i);
        System.out.println("The var is name i in this class equal " + i);
    }

}
