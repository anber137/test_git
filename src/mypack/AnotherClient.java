package mypack;

public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Еще один вариант метода Callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
