package com.corejava;

import java.util.concurrent.Callable;

public class TaskClassCallable implements Callable<Integer> {


    int printupto=0;

    TaskClassCallable(int printupto){
        this.printupto = printupto;
    }
    @Override
    public Integer call() throws Exception {


        for(int i=0;i<printupto;i++)
        {
            System.out.println(Thread.currentThread().getName()+"<-->"+i);


        }
        return (Integer)printupto;
    }
}
