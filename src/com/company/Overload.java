package com.company;

public class Overload {
    public static void main(String args[]){
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(12.2);
        System.out.println(result);
    }
}
