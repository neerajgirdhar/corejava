package com.corejava;

import java.util.function.BiConsumer;

public class BiConsumerEcample {

    public static void main(String args[]) {

        BiConsumer<Integer,Integer> biConsumer =(value,value1) -> {
            int addition = value.intValue() + value1.intValue();
            System.out.println(addition);
        };
    biConsumer.accept(Integer.valueOf(10),Integer.valueOf(12));

    }

}
