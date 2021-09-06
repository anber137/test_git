package com.company;

public class RefDemo {
    public static void main(String argsp[]){
        BoxWeight weightbox =new BoxWeight(3, 5, 7, 8.37);
        box plainbox = new box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume equal " + vol);
        System.out.println("Weight equal " + weightbox.weight);

        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();

        System.out.println("Volume plainbox " + vol);


    }
}
