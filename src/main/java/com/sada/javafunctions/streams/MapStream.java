package com.sada.javafunctions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStream {
    public static void main (String []args){
        Integer[] integers={1,2,3,4,5,6,7,8,9,10};
        List<Integer> integerList=new ArrayList<>(Arrays.asList(integers));

        Function<Integer,Integer> timesTwo=(x) -> x*2;

        List<Integer> doubled=integerList.stream().map(timesTwo).collect(Collectors.toList());
        System.out.println( doubled);


    }
}
