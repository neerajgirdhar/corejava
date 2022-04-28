package com.corejava;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String args[]) {
        Supplier<String> supplier1 = () -> {
            return "Hello";
        };

        Supplier<Integer> supplier2 = () -> {
            return Integer.valueOf(12);
        };

        Supplier<TestCla> supplier3 = () -> {
            return new TestCla();
        };

       System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        supplier3.get().sayHello();
    }



}
