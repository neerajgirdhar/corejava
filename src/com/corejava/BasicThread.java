package com.corejava;


import static java.lang.Thread.*;

public class BasicThread extends Thread {

    BasicClass bb;
    String message;

    BasicThread(BasicClass bb,String message)
    {
        this.bb =bb;
        this.message=message;
    }

    public void run()
    {
        System.out.println("In Run.....");
        synchronized (this.bb) {
            this.bb.accessSynchronizedCode(this.getName(), this.message);
        }
    }

    public static void main(String args[])
    {
        BasicClass bb= new BasicClass();

        BasicThread bt1= new BasicThread(bb,"Message1");
        bt1.setName("T1");
        bt1.start();

        BasicThread bt2= new BasicThread(bb,"Message2");
        bt2.setName("T2");
        bt2.start();

        BasicThread bt3= new BasicThread(bb,"Message3");
        bt3.setName("T3");
        bt3.start();
    }
}
