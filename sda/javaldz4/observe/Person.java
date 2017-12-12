package com.sda.javaldz4.observe;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Person {
    String name;
    int maxAceptetTemperature;

    public Person(String name, int maxAceptetTemperature) {
        this.name = name;
        this.maxAceptetTemperature = maxAceptetTemperature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxAceptetTemperature(int maxAceptetTemperature) {
        this.maxAceptetTemperature = maxAceptetTemperature;
    }

    public int getMaxAceptetTemperature() {
        return maxAceptetTemperature;
    }
    void update(int temperature){
        System.out.printf("%s twierdzi, ze temperatura %s C to za gorąca!", name, temperature);
    }

    public void react(int temperature){
        if(temperature>maxAceptetTemperature){
            System.out.println("Włącz klimatyzację");
        }
    }
}


