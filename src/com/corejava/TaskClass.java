package com.corejava;

public class TaskClass implements Runnable{

    int printupto=0;

    TaskClass(int printupto){
        this.printupto = printupto;
    }
    @Override
    public void run() {
        for(int i=0;i<printupto;i++)
        {
            System.out.println(Thread.currentThread().getName() +i);

        }

    }
}
