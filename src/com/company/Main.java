package com.company;

public class Main {

    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        System.out.println("let's go");
        for(int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        for(int i=0; i<10; i++) System.out.println(mystack1.pop());
        for(int i=0; i<10; i++) System.out.println(mystack2.pop());

    }
}

