package com.corejava.com.corejava.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClassImplementsFunctionalInterface {

    public static void main(String args[]) {

        FunctionalInterfaceExample1 bb =()->{
            System.out.println("Without param lambda");
        };
        bb.abstractMethod();
        System.out.println("*************************************");


        FunctionalInterfaceExample sum1 = (a, b) -> {
            int c = a + b;
            return c;
        };

        System.out.println(sum1.abstractMethod(10,11));
        FunctionalInterfaceExample.staticMethod();
        System.out.println("**********Iterating  Hashmap using list and foreach***************************");

        Map<String, Integer> prices = new HashMap<>();
        prices.put("Apple", 50);
        prices.put("Orange", 20);
        prices.put("Banana", 10);
        prices.put("Grapes", 40);
        prices.put("Papaya", 50);

	    prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));
        System.out.println("*************Iterating  List using list and foreach************************");

        List names = new ArrayList();
        names.add("Ajay");
        names.add("Ben");
        names.add("Cathy");
        names.add("Dinesh");
        names.add("Tom");


        names.forEach(name->System.out.println(name));


       /*
       map: The map method is used to map the items in the collection to other objects according to the Function passed as argument.
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());

filter: The filter method is used to select elements as per the Predicate passed as argument.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());

Terminal Operations:

collect: The collect method is used to return the result of the intermediate operations performed on the stream.
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());

forEach: The forEach method is used to iterate through every element of the stream.
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));

reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.
List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        */

    }


    }



