package Iface;

interface AA {
    void meth1();
    void meth2();
}

interface BA extends AA {
    void meth3();
}

class MyClass implements BA{
    public void meth1(){
        System.out.println("meth1()");
    }
    public void meth2(){
        System.out.println("meth2()");
    }
    public void meth3(){
        System.out.println("meth3()");
    }
}

class IFExtend {
    public static void main(String args[]){
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}