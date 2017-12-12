package com.sda.javaldz4.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.sda.javaldz4.factory.DocumentGenertor.*;

public class Document {
    private DocumentType type;
    private String textToSave;

    public Document(DocumentType type) {
        this.type = type;
    }

    public Document(String textToSave, DocumentType type) {
        this.textToSave=textToSave;
        this.type=type;
    }


    public void setText(String text) {
        this.textToSave = text;
    }

    public String getText() {
        return textToSave;
    }

    public void saveFile() {
        String path = "C:\\Users\\Bartłomiej";
        String fileName = "my_own_file";

        String outputPath = String.format("%s/%s.%s", path, fileName, type.getExtension());
        System.out.println("Plik został zapisanna"+outputPath);
        System.out.println("Tekst do zapisania"+ textToSave);


        try

        {
            File file = new File(outputPath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(textToSave);
            fileWriter.flush();//w przypadku gdy mamy przekopiować zawarość wyniku wrzuca do pamieci a flush wrzuca do pliku odrazu
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
