package com.company;

public class BC extends AC{
    int k;
    BC(int a, int b, int c){
        super(a, b);
        k = c;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}
