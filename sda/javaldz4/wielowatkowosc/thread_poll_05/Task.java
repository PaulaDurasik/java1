package com.sda.javaldz4.wielowatkowosc.thread_poll_05;

public class Task implements Runnable {
    private int id;

    public Task(int id){
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println("Rozpoczynam zadanie"+id);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakonczyłem zadanie"+id);
        System.out.println();

    }
}
