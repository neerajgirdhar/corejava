package com.corejava;

public class SingletonClassExample {

    private static SingletonClassExample singleObject1 = null;

    private SingletonClassExample() {

    }

    public static SingletonClassExample getInstance() {

        System.out.println("in static ");
        synchronized (SingletonClassExample.class) {
            if (singleObject1 == null) {
                singleObject1 = new SingletonClassExample();
            }
        }
        return singleObject1;
    }


    public static void main(String args[]) {
        System.out.println("in main ");
        SingletonClassExample singletonClassExample1 = SingletonClassExample.getInstance();
        SingletonClassExample singletonClassExample2 = SingletonClassExample.getInstance();

        if (singletonClassExample1 == singletonClassExample2) {
            System.out.println("Same object with == operator"+singletonClassExample1.hashCode() +":: "+singletonClassExample2.hashCode());
        }

        if (singletonClassExample1.equals(singletonClassExample2)) {
            System.out.println("Same object with equals method");
        }


    }
}
