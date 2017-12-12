package com.sda.javaldz4.wielowatkowosc.procesor;

public  class Processor extends Thread{
    private volatile boolean running=true;
    @Override
    public void run() {
        while (running) {
            System.out.println("napis");
            try {
                Processor.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stopped!");
    }

    public void stopMyThread(){
        running=false;
    }

}

