package com.sda.javaldz4.biblioteka;

public enum Kategoria {
    SCIFI("Science Ficion"), DRAMAT("Dramat "), KOMEDIA("Komedia"), BAJKA("Bajka"), EPOPEJA("Epopeja"), IT("IT");

    private String czytelnaNazwa;

    Kategoria(String czytelnaNazwa) {
        this.czytelnaNazwa = czytelnaNazwa;
    }

    public String getCzytelnaNazwa() {
        return czytelnaNazwa;
    }
}
