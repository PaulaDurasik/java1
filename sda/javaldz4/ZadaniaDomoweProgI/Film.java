package com.sda.javaldz4.ZadaniaDomoweProgI;

import java.util.List;

public class Film {
    private String tytul;

    public Film(String tytul){
        this.tytul=tytul;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                '}';
        }
    }

