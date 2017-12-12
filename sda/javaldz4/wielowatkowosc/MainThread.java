package com.sda.javaldz4.wielowatkowosc;

import com.sda.javaldz4.wielowatkowosc.deadlock_07.Bank;
import com.sda.javaldz4.wielowatkowosc.lock_04.Lock;
import com.sda.javaldz4.wielowatkowosc.procesor.Processor;
import com.sda.javaldz4.wielowatkowosc.synchronized_01.Worker;
import com.sda.javaldz4.wielowatkowosc.thread_poll_05.BasicPool;
import com.sda.javaldz4.wielowatkowosc.wait_notyfi_06.App;
import sun.awt.windows.ThemeReader;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        //myThread();
        //myThread2();
        //runable();
       // processor();
        //synchronizedThread();
       // lock();
        //pool();
        //waitnotify();
        bank();
    }

    private static void bank() {
        Bank bank=new Bank();
        bank.start();
    }

    private static void waitnotify() {
        App app=new App();
        app.work();

    }

    private static void pool() {
        BasicPool basicPool=new BasicPool();
        basicPool.run();
    }

    private static void lock() {
        Lock lock=new Lock();
        lock.work();
    }

    private static void synchronizedThread() {
        Worker worker=new Worker();
        worker.firstRun();
        worker.secoundRun();


    }

    private static void processor() {
        Processor processor=new Processor();
        processor.start();
        new Scanner(System.in).nextLine();
        processor.stopMyThread();

    }

    private static void runable() {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Hello"+ Thread.currentThread().getId());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                }


        });
    }


    private static void myThread2() {
        Thread thread=new Thread(new MyThread());
        thread.start();
    }

    private static void myThread() {
        System.out.println("ID main thread:"+ Thread.currentThread().getId());
        MyThread myThread1=new MyThread();
        myThread1.start();
        MyThread myThread2=new MyThread();
        myThread2.start();
    }
}
