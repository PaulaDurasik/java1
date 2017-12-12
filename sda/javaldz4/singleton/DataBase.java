package com.sda.javaldz4.singleton;

import java.util.ArrayList;

public class DataBase {
    private static DataBase instance = null;
    private ArrayList<String> list=null;

    private DataBase() {
        list =new ArrayList<>();
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Conected!");
    }
    public void saveData(String value){
        list.add(value);
    }

    public static class getInstance extends DataBase {
    }
}


