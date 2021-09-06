package mypack;

class Client implements Callback{

    public void callback(int p){
        System.out.println("Метод callback(), " + "вызывается со значением " + p);
    }

    void nonIfaceMeth(){
        System.out.println("В классах, реализующих интерфейсы могуь определяться и другие члены");
    }

}
