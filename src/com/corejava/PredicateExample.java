package com.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String args[]) {

        Predicate<Integer> p = (value) -> {
            boolean k =value.intValue() < 15;
            return k;
        };

        Predicate<Integer> p1 = (value) -> (value.intValue() > 15);
        Predicate<Integer> p2 = (value) -> (value.intValue() == 15);


        List<Integer> listInt = new ArrayList<>();
        listInt.add(Integer.valueOf(10));
        listInt.add(Integer.valueOf(15));
        listInt.add(Integer.valueOf(17));
        listInt.add(Integer.valueOf(18));

        System.out.println("Number Less than 15 checked by Predicate p");
        for (Integer inte : listInt) {
            if (p.test(inte)) {
                System.out.println(inte.intValue());
            }

        }
        for (Integer inte1 : listInt) {
            System.out.println(p.test(inte1));
        }
        System.out.println("Number Greater than 15 checked by Predicate p1");
        for (Integer inte : listInt) {
            if (p1.test(inte)) {
                System.out.println(inte.intValue());
            }
        }

        System.out.println("Number equals to 15 checked by Predicate p2");
        for (Integer inte : listInt) {
            if (p2.test(inte)) {
                System.out.println(inte.intValue());
            }
        }


    }
}