package com.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEcample {
    public static void main(String args[]) {

        Consumer<Integer> consumer = val -> {
            System.out.println(val.intValue());
        };

        List<Integer> listInt = new ArrayList<>();
        listInt.add(Integer.valueOf(10));
        listInt.add(Integer.valueOf(15));
        listInt.add(Integer.valueOf(17));
        listInt.add(Integer.valueOf(18));

        for(Integer inte : listInt){
            consumer.accept(inte);
        }
    }
}
