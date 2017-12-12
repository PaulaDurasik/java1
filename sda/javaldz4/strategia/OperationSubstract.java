package com.sda.javaldz4.strategia;

public class OperationSubstract implements Strategia {
    @Override
    public int doOperation(int numerOne, int numberTwo) {
        return numerOne-numberTwo;
    }
}
