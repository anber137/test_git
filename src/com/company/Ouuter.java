package com.company;

public class Ouuter {
    int ouyre_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.displa();


        }
    class Inner {
        void displa() {
            System.out.println(ouyre_x);
        }

    }


}
