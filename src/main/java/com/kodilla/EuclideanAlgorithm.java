package com.kodilla;

public class EuclideanAlgorithm {

    public static void main(String[] args){

        int a = 28;
        int b = 12;

        System.out.println("The greatest common divisor of " + a + " and " + b + " is: ");

        while(a!=b){
            if(a>b) {
                a -= b;
            }else{
                b -= a;
            }
        }
        System.out.println(a);
    }
}

