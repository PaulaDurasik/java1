package Czwartytydzien;

import com.sun.org.apache.xpath.internal.SourceTree;

public class UruchmAuthor {
    public static void main(String[] args) {
        Author author = new Author("Paula", "adb@dhdhd.pl", 'f');
        Author author1 = new Author("Ziutek", "agb@oah.pl", 'm');
        Author[] authors = {author,author1};
        // for (int i = 0; i < authors.length; i++) {
            //System.out.print(authors[i] + " ");

//            System.out.println(author);
//            Book book = new Book("przminelo z wiatrem", author, 10, 1);
//            System.out.println(book);
//
            BookWithAuthors bookWithAuthors = new BookWithAuthors("przeminelo z wiatrem", authors, 10, 1);
            System.out.println(bookWithAuthors.toString());
        String getAuthorNames=(author.getName());
        System.out.println(getAuthorNames.toString());
        System.out.println(bookWithAuthors.Plec());


        }
    }

