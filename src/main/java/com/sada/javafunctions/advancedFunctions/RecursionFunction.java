package com.sada.javafunctions.advancedFunctions;



public class RecursionFunction {
    static void countDown(Integer x){
        if(x<0){
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countDown(x-1);
    }

        static void countUp(Integer y,Integer end){
            if(y>end){
                System.out.println("done!");
                return;
            }
            System.out.println(y);
            countUp(y + 1,end);
        }

    public static void main(String[] args) {
            countDown(10);
            countUp(0,20);


    }

    }


