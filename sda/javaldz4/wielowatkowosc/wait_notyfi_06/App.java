package com.sda.javaldz4.wielowatkowosc.wait_notyfi_06;

public class App {
    public void work(){

        Proc proc=new Proc();
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        proc.produce();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    proc.consume();
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

    }

    }

