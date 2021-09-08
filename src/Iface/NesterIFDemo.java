package Iface;

public class NesterIFDemo {
    public static void main(String args[]){
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("Число 10 > 0");
        if(nif.isNotNegative(-12))
            System.out.println("Число не будет выведено");
        NowNumberPage.print();
    }
}
