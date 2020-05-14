package com.corejava;
import static java.lang.Thread.*;
public class BasicClass {


    public  void accessSynchronizedCode(String threadName,String message) {
        System.out.println("In synchronized method");

            try {
                if(threadName.equals("T1")) {
                    System.out.println("Will Wait 10 Sec");
                    sleep(10000);
                }
                if(threadName.equals("T2")){
                    System.out.println("Will Wait 20 Sec");
                    sleep(20000);
                }

                if(threadName.equals("T3")) {
                    System.out.println("Will Wait 30 Sec");
                    sleep(30000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        System.out.println(message);
    }
}
