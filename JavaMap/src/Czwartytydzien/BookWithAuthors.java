package Czwartytydzien;

public class BookWithAuthors {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public BookWithAuthors(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;

    }

    public BookWithAuthors(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String autor = "";
        for (Author author : authors) {//przeszukuje tablice
            autor = autor + author.toString();
        }
        return "Book:" + "tytu:" + " " + name + "," + autor + "cena:" + " " + price + "ilosc:" + " " + qty;

    }

    public String getAuthorNames() {
        String autor = "";
        for (Author author : authors) {
            autor = autor + author.getName();
        }

        return "getAuthorNames" + autor.toString();
    }
    public int Plec(){
        int kobiety=0;
        int mezczyzni=0;
        for (Author autor:authors){
            char i=autor.getGender();
            if(i==kobiety){
                kobiety++;
            }
            if(i==mezczyzni){
                mezczyzni++;
            }

        }return kobiety + mezczyzni;
    }
}