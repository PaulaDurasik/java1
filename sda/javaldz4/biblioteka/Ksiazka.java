package com.sda.javaldz4.biblioteka;

public class Ksiazka implements Comparable<Ksiazka> {
    private String tytul;
    private Integer liczbaStron;
    private String isbn;
    private Autor autor;
    private Kategoria kategoria;
    private Integer rokWydania;



    public Ksiazka(String tytul, Integer liczbaStron, String isbn, Autor autor, Kategoria kategoria, Integer rokWydania) {
        this.tytul=tytul;
        this.liczbaStron=liczbaStron;
        this.isbn=isbn;
        this.autor=autor;
        this.kategoria=kategoria;
        this.rokWydania=rokWydania;

    }


    public String getTytul() {
        return tytul;
    }

    public Integer getLiczbaStron() {
        return liczbaStron;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public Integer getRokWydania() {
        return rokWydania;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setLiczbaStron(Integer liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public void setIsbr(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public void setRokWydania(Integer rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", kategoria=" + kategoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ksiazka ksiazka = (Ksiazka) o;

        return isbn.equals(ksiazka.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public int compareTo(Ksiazka o) {
        return this.tytul.compareTo(o.tytul);
    }
}
