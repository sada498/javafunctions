package com.sada.javafunctions;



import java.util.function.BiFunction;

public class BiFunctions {
    public static void main(String[] args){
        //by using BiFunctional to pass two values and return value
        BiFunction<Integer,Integer,Integer> add=(x,y) ->x+y;
        System.out.println(add.apply(32,32));

        //Tri function
        TriFunction<Integer,Integer,Integer,Integer> addThree=(x,y,z) -> (x+y+z);
        System.out.println(addThree.apply(34,56,67));
        // NoArgFunction
        NoArgFunction<String> sayHello=() -> "Hello Message from NoArgFunction ";
        System.out.println(sayHello.apply());

    }
}
