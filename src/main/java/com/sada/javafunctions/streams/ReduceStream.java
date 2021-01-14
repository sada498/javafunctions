package com.sada.javafunctions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList=new ArrayList<>(Arrays.asList(integers));

        BinaryOperator<Integer> getSum=(acc,x) ->
        {

            Integer result= acc+x;
            System.out.println(acc + " "+ x + "result" +result);
            return result;
        };
        Integer sum=integerList.stream().reduce(0,getSum);
        System.out.println(sum);
    }

}
