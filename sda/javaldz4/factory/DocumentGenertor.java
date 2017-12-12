package com.sda.javaldz4.factory;

import static com.sda.javaldz4.factory.DocumentGenertor.DocumentType.HTML;
import static com.sda.javaldz4.factory.DocumentGenertor.DocumentType.TXT;
import static com.sda.javaldz4.factory.DocumentGenertor.DocumentType.XML;

public class DocumentGenertor {


    public Document createDocument(String myText,DocumentType type){
        Document document;
        switch (type){
            case TXT:
                document=new TxtDocumnet(TXT);
                break;
            case HTML:
                document=new HtlmDocumnet(myText,HTML);
                break;
            case XML:
                document=new XmlDocument(myText,XML);
                break;
                default:
                    document=null;
                    break;
        }
        return document;
    }

    public enum DocumentType{
        TXT("txt"), HTML("html"), XML("xml");
        private String extension;

        DocumentType(String e){
            extension=e;
        }

        public String getExtension() {
            return extension;
        }
    }
}
