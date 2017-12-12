package com.sda.javaldz4.fasada;



public class Facade {
    private Lamp light=new Lamp();
    private Windows window=new Windows();
    public void activate(){
        light.on();
        window.open();
    }
    public void desactivate(){
        light.off();
        window.close();
    }
}
