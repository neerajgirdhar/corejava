package com.corejava;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String args[]) {
        BiPredicate<Integer, Integer> bipredicate = (value, value1) -> {
            return (value.intValue() == value1.intValue());
        };
       System.out.println(bipredicate.test(Integer.valueOf(10),Integer.valueOf(11)));
    }

}


