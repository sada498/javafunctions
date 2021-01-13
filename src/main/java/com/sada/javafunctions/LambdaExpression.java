package com.sada.javafunctions;


import java.util.function.Function;

public class LambdaExpression {
    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };
        //you can apply the static data by using functional apply method to pass the value]
        System.out.println(absoluteValue.apply(100));
    }
}
