package com.sada.javafunctions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args){
        Integer[] integers={1,2,3,4,5,6,7,8,9,10};
        List<Integer> integerList=new ArrayList<>(Arrays.asList(integers));


        /**
         * before functions and streams
         */
//        List <Integer> evens=new ArrayList<>();
//        for (int i=0; i< integerList.size(); i++){
//            Boolean isEven=integerList.get(i)% 2==0;
//            if(isEven){
//                evens.add(integerList.get(i));
//            }
//
//        }
        /**
         * By using predicate function we can reduce the code and get a result
         */
//        Predicate<Integer> isEven=(x) -> x%2 ==0;
//
//        List<Integer> even=integerList.stream().filter(isEven).collect(Collectors.toList());
        //or
        List<Integer> even=integerList.stream().filter(x-> x%2==0).collect(Collectors.toList());
        System.out.println(even);

        String[] strings={"Hello", "World!","functional","programming", "is","cool"};
        List<String> stringList=new ArrayList<>(Arrays.asList(strings));
        Predicate<String> longerThenFiveChar=(str)-> str.length()>5;
        List<String> stringList1=stringList
                .stream()
                .filter(longerThenFiveChar)
                .collect(Collectors.toList());
        System.out.println(stringList1);
        //or
        List<String> stringList2=stringList
                .stream()
                .filter(x-> x.length()>5)
                .collect(Collectors.toList());
        System.out.println(stringList2);



    }
}
