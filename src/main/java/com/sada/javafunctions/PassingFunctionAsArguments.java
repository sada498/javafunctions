package com.sada.javafunctions;
import java.util.function.BiFunction;

public class PassingFunctionAsArguments {
    public static  class MyMath{
        public static Integer add(Integer x,Integer y){
            return x+y;
        }
        public static Integer subtract(Integer x,Integer y){
            return x-y;
        }
        public static Integer combine(BiFunction<Integer,Integer,Integer> combineFunctions){
            return combineFunctions.apply(5,9);

        }
    }
    public static void main (String[] args){
        System.out.println(MyMath.combine(MyMath::add));
        System.out.println(MyMath.combine((MyMath::subtract)));
        //you can pass the lambda function in method also
        System.out.println(MyMath.combine((x,y)-> 2*x+5*y ));

    }
}
