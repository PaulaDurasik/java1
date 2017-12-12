package com.sda.javaldz4.wielowatkowosc.deadlock_07;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private Accont acc1=new Accont();
    private Accont acc2=new Accont();
    Random random=new Random();
    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();
    public void start(){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                firstAction();

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                secondAction();

            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stan konta nr 1:"+acc1.getBalance());
        System.out.println("Stan konta nr 2:"+ acc2.getBalance());
        System.out.println("SUM :"+ (acc1.getBalance()+acc2.getBalance()));
    }

    private void secondAction() {
        for (int i = 0; i < 10; i++) {
            lock2.lock();
            lock1.lock();
            Accont.transfer(acc1,acc2,random.nextInt(100));
            lock1.unlock();
            lock2.unlock();

        }
    }



    private void firstAction() {
        for (int i = 0; i <10 ; i++) {
            lock1.lock();
            Accont.transfer(acc2,acc1,random.nextInt(100));
            lock1.unlock();

        }
    }

}
