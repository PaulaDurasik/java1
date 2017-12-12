package com.sda.javaldz4.strategia;

public class Calculator {
    private Strategia strategia;

    public Calculator(Strategia strategia) {
        this.strategia = strategia;
    }

    public int executeStrategy(int numerOne, int  numerTwo){
        return strategia.doOperation(numerOne, numerTwo);
    }
}
