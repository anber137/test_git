package com.company;

public class DemoShipment {
    public static void main(String args[]){
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("s1 " + vol);
        System.out.println("w1 " + shipment1.weight);
        System.out.println("c1 " + shipment1.cost);

        vol = shipment2.volume();
        System.out.println("s2 " + vol);
        System.out.println("w2 " + shipment2.weight);
        System.out.println("c2 " + shipment2.cost);

    }
}
