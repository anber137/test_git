package Iface;

public interface MyIf {
    int getNumber();

    default String getString(){
        return "Object is a type String default";
    }

    static int getDefauotNumber(){
        return 0;
    }

}
