package com.example.twothreads;

import java.util.Random;

public class Generator extends Thread {

    private int amount;
    private int interval;

    {
        this.interval = new Random().nextInt(100, 501);
    }

    public int getAmount () {
        return amount;
    }

    public int getInterval () {
        return interval;
    }



    Generator (int amount) {
        this.amount = amount;
    }

    public void work() {
        MyMessage[] myMessages = new MyMessage[amount];
        for(int i=0;i<this.amount;i++) {
            myMessages[i] = new MyMessage();
            System.out.println(myMessages[i].toString());
            try {
                sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Override
    public void run() {
        work();
    }

}
