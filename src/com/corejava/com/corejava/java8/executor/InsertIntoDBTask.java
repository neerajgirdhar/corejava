package com.corejava.com.corejava.java8.executor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InsertIntoDBTask extends Thread {

    private int startIndex;
    private int endIndex;
    private CopyOnWriteArrayList<String> list;
    private int threadIndex;

    public InsertIntoDBTask(int startIndex, int endIndex, CopyOnWriteArrayList<String> list,int threadIndex){
        this.startIndex= startIndex;
        this.endIndex =endIndex;
        this.list = list;
        this.threadIndex = threadIndex;


    }
@Override
public void run(){
    this.setName("Thread"+this.threadIndex);
for(int i = startIndex;i<=endIndex;i++){
    System.out.println("Thread NAME "+ this.getName()+" Inserting record Number "+i+" Value is "+list.get(i));
}
}

}