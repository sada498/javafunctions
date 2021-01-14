package com.sada.javafunctions.advancedFunctions;

import com.sada.javafunctions.BiFunctions;
import com.sada.javafunctions.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialApplicationFunction {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add =
                (x, y, z) -> x + y + z;
        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
                (x) -> (y, z) -> add.apply(x, y, z);
        BiFunction<Integer,Integer,Integer> addValue=addPartial.apply(5);
        System.out.println(addValue.apply(7,10));

    }
}
