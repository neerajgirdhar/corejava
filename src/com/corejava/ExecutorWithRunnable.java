package com.corejava;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorWithRunnable {

    public static void main(String args[])
    {
       //ExecutorService executor = Executors.newFixedThreadPool(10);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i=1;i<200;i++)
        {
            TaskClass task = new TaskClass(i);
            executor.execute(task);
        }
        executor.shutdown();

        System.out.println("Finished all threads");
    }
}
