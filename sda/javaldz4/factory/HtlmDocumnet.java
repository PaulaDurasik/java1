package com.sda.javaldz4.factory;

import com.sun.javafx.binding.StringFormatter;

public class HtlmDocumnet extends Document {
    public HtlmDocumnet(String textToSave,DocumentGenertor.DocumentType type){
        super(formatText(textToSave),type);

    }
    private static String formatText(String textToSave){
       return String.format("<h1>%s</h1>", textToSave.replaceAll("\r\n","<br>"));

    }


}
