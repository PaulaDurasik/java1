package com.sda.javaldz4.wielowatkowosc.deadlock_07;

public class Accont {
    private int balance=10000;

    public void deposit(int amount){
        balance+=amount;
    }
    public void withdrow(int amount){
        balance-=amount;
    }

    public int getBalance() {
        return balance;
    }
    public static void transfer(Accont acc1,Accont acc2, int amount){
        acc1.withdrow(amount);
        acc2.withdrow(amount);

    }
}
