package com.sda.javaldz4.strategia;

public class OperationAdd implements Strategia {
    @Override
    public int doOperation(int numerOne, int numberTwo) {
        return numberTwo+numerOne;
    }

}
