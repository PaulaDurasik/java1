package com.sda.javaldz4.wielowatkowosc.thread_poll_05;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicPool {
    public void run(){
        //liczba osob do obsługi zadania
        ExecutorService executorService= Executors.newFixedThreadPool(2);//zależnie ile dodoaty tak zostanie rozwiązane
        for (int i = 0; i <10; i++) {
            executorService.submit(new Task(i));

        }

        executorService.shutdown();
        System.out.println("Wszystkie zadania zostały dodane" );

    }
}
