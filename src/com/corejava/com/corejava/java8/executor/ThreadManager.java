package com.corejava.com.corejava.java8.executor;

import java.util.concurrent.*;

public class ThreadManager {

   //private ExecutorService THREADPOOL = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    private ExecutorService THREADPOOL = Executors.newFixedThreadPool(2);


    public static void main(String args[]){
        ThreadManager thM = new ThreadManager();
        thM.initiate();
        thM.shutdown();
System.out.println("Available Processor "+Runtime.getRuntime().availableProcessors());
    }
public void initiate()
{
    CopyOnWriteArrayList list = new CopyOnWriteArrayList<String>();
    for(int i =0 ;i<80000;i++){
        list.add("Value "+i);
    }
int start =0;
    int end =39999;
    for(int i =0 ;i<2;i++) {

        this.THREADPOOL.execute(new InsertIntoDBTask(start,end,list,i));
        start = start+40000;
        end = end+40000;
    }
}

public boolean shutdown()
{
    THREADPOOL.shutdown();
    try {
        if (!THREADPOOL.awaitTermination(20,TimeUnit.SECONDS)) {
            System.out.println("Waiting for threds to shutdown");
            THREADPOOL.shutdownNow();
            if (!THREADPOOL.awaitTermination(10,TimeUnit.SECONDS)) {
                System.out.println("Giving additional 10 seconds for threds to shutdown");
            }
            return false;
        }
    }
        catch (InterruptedException ex)
        {
            THREADPOOL.shutdownNow();
            Thread.currentThread().interrupt();
            System.out.println("Thread Pool Did not Terminate");
            return false;
        }

    return true;

}
}
