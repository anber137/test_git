package com.company;

public class Factorial {

    int fact(int n){
        int result;

        if (n==1) {
            result = 1;
            System.out.println(result + " n= " + n);
        }

        else{
            result = fact(n-1) * n;
            System.out.println(result + " n= " + n);
        }
        return result;
    }
}
