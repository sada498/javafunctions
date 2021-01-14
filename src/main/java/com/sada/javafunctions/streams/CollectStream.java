package com.sada.javafunctions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStream {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));

        String[] strings = {"Hello", "World!", "functional", "programming", "is", "cool"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
        List<String> stringList1=stringList
                .stream()
                .filter(x-> x.length()>5)
                .collect(Collectors.toList());
        //collection join
        String s=stringList
                .stream()
                .filter(x-> x.length()>5)
                .collect(Collectors.joining(","));
        System.out.println(s);
        Long stringCount=stringList
                .stream()
                .filter(x-> x.length()>5)
                .collect(Collectors.counting());
        System.out.println(stringCount);
        Map<Integer,List<String>> wordLength=stringList
                .stream()
                .collect(Collectors.groupingBy(
                x-> x.length()

        ));
        System.out.println(wordLength);



    }
}
