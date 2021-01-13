package com.sada.javafunctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

@SpringBootApplication
public class JavafunctionsApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(JavafunctionsApplication.class, args);
//	}

    protected static class MyMatch{
        public static Integer triple(Integer x){
            return x*3;
        }
        public static void main(String[] args){
            Function<Integer,Integer> myTriple=MyMatch::triple;
            Integer result=myTriple.apply(5);
            System.out.println(result);
        }

    }
}
