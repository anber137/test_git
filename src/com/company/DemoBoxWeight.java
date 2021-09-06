package com.company;

public class DemoBoxWeight {
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume mybox1 equal " + vol);
        System.out.println("weight mybox2 equal " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume mybox2 equal " + vol);
        System.out.println("weight mybox2 equal " + mybox2.weight);

        vol = mybox3.volume();
        System.out.println("Volume mybox3 equal " + vol);
        System.out.println("weight mybox3 equal " + mybox3.weight);

        vol = myclone.volume();
        System.out.println("Volume myclone equal " + vol);
        System.out.println("weight myclone equal " + myclone.weight);

        vol = mycube.volume();
        System.out.println("Volume mycube equal " + vol);
        System.out.println("weight mycube equal " + mycube.weight);

    }
}
