package com.sda.javaldz4.strategia;

public class MainStra {
    public static void main(String[] args) {
        strategy();
    }

    private static void strategy() {
        Calculator calculator=new Calculator(new OperationAdd());
                int result=calculator.executeStrategy(10,5);
        System.out.println("10+5="+ result);


        calculator=new Calculator(new OperationSubstract());
        result=calculator.executeStrategy(10,5);
        System.out.println("10-5="+ result);

        calculator=new Calculator(new Operationdivision());
        result=calculator.executeStrategy(10,5);
        System.out.println("10/5="+ result);

        calculator=new Calculator(new OperationMultiplication());
        result=calculator.executeStrategy(10,5);
        System.out.println("10*5="+ result);
    }
}
