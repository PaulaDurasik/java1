package com.sda.javaldz4.buildery;

import com.sda.javaldz4.factory.Document;
import com.sda.javaldz4.factory.DocumentGenertor;
import com.sda.javaldz4.fasada.Facade;
import com.sda.javaldz4.observe.Person;
import com.sda.javaldz4.observe.Weather;
import com.sda.javaldz4.singleton.DataBase;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        //
        // builder();
        //factory();
        //cade();
       // observe();
        singletonnn();


    }

    public static void singletonnn() {
        DataBase db=new DataBase.getInstance();
        System.out.println(db.hashCode());
        db.saveData("Adam");
        db.saveData("Kuba");

    }



    public static void observe() {
        Person person1 = new Person("Sandra", 23);
        Person person2 = new Person("Darek", 23);
        Person person3 = new Person("Paula", 21);
        System.out.println(person1.hashCode());
        Weather weather = new Weather();
        weather.addpersons1(person1,person2,person3);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj temperaturę");
            int temperature = scanner.nextInt();
            weather.update(temperature);
            System.out.println();
        }
    }

    public static void facade() {
        Facade system = new Facade();
        system.activate();
        system.desactivate();


    }

    private static void factory() {
        DocumentGenertor genertor = new DocumentGenertor();

        String myText = "Największa w Polsce\r\nakademia programowania";
        Document txt = genertor.createDocument(myText, DocumentGenertor.DocumentType.TXT);
        Document html = genertor.createDocument(myText, DocumentGenertor.DocumentType.HTML);
        Document xml = genertor.createDocument(myText, DocumentGenertor.DocumentType.XML);
        html.setText(myText);
        html.saveFile();
        System.out.println(html.getText());
        Document x1 = genertor.createDocument(myText, DocumentGenertor.DocumentType.HTML);

    }

    private static void builder() {
        User user = new User.UserBuilder("Ania")
                .lastName("Nowak")
                .age(12)
                .addres("Lodz")
                .phone(794990000)
                .build();

        User user1 = new User.UserBuilder("Zosia")
                .lastName("Durasik")
                .build();
        System.out.println(user.toString());
        System.out.println(user1.toString());
    }
}
