package com.sda.javaldz4.observe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {

    private int temperature;
    private List <Person> persons;


    public void addpersons(Person person) {
        persons.add(person);

    }
    public void addpersons1(Person...people) {
        persons.addAll(Arrays.asList(people));

    }

    public Weather() {
        persons = new ArrayList <>();
        temperature = 0;
    }

    public void removeperson(Person person) {
        persons.remove(person);

    }

    public void update(int newTemperature) {
        temperature = newTemperature;
        notityObservers();
    }
    private void notityObservers(){
        for(Person person: persons)
        if(temperature>person.getMaxAceptetTemperature()){
            person.update(temperature);
        }
    }
}