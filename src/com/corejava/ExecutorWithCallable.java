package com.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable {
    public static void main(String args[])
    {
        List<Future<Integer>> list = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(10);
        // ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i=1;i<200;i++)
        {
            TaskClassCallable task = new TaskClassCallable(1000);
           Future<Integer> status = executor.submit(task);
            list.add(status);
        }
        executor.shutdown();

     for(int j=0;j<list.size();j++)
     {
         Future<Integer> fut =  list.get(j);
         try {
             int printupto = fut.get().intValue();
             System.out.println(printupto);
         } catch (InterruptedException e) {
             e.printStackTrace();
         } catch (ExecutionException e) {
             e.printStackTrace();
         }
     }
    }
}
