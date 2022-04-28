package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String args[]){
        List<String> stringList = new ArrayList<>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        StreamExample streamExample = new StreamExample();
        streamExample.terminalOperationExample(stringList);
        streamExample.nonTerminalOperationExample(stringList);



       /* Stream<String> stream = stringList.stream();

        Stream<String> derivedStream = stream.map((value) -> { return value.toLowerCase(); });

        Stream<String> derivedStream1 = derivedStream.flatMap((value) -> {
            String[] split = value.split(" ");
            return (Stream<String>) Arrays.asList(split).stream();
        });

        derivedStream1.forEach(value -> {System.out.println(value);});*/


    }
    public void nonTerminalOperationExample( List<String> stringList)
    {
        Stream<String> stream = stringList.stream();

       Stream<String> lowerCaseStream = stream.map((value) -> { return value.toLowerCase(); });
        //lowerCaseStream.forEach(s -> System.out.println(s));
       Stream<String> backToUpperCaseStream = lowerCaseStream.map(value -> {return value.toUpperCase();});

        backToUpperCaseStream.forEach(s -> System.out.println(s));
    }



    public void terminalOperationExample( List<String> stringList)
    {
        Stream<String> stream = stringList.stream();

        long count = stream
                .map((value) -> { return value.toLowerCase(); })
                .count();

        System.out.println("count = " + count);
    }
}
