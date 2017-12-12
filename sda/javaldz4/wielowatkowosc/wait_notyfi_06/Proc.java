package com.sda.javaldz4.wielowatkowosc.wait_notyfi_06;

import java.util.Scanner;

public class Proc {


    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("T2---oczekuje");
            wait();
            System.out.println("T2--zakończ oczekiwanie");

        }
    }
    public void consume(){
        synchronized (this) {
            System.out.println("T1--oczekuje na klawisz enter");
            Scanner scanner=new Scanner(System.in);
            scanner.nextLine();
            System.out.println("T1- klikęcie Enter");
            notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Zakonczono blok");
        }
    }
}
