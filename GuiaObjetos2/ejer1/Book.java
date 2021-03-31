package GuiaObjetos2.ejer1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {

    private String title;
    private int price;
    private int stock;
    private Author[] author;


    public Book() {
    }

    public Book(String title, int price, int stock, Author[] author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + Arrays.toString(author) +
                '}';
    }

    public String bookSumary(){
        return "The book, " + title + " of " + author[0].getName() + " " + author[0].getLastname()  + " and " + author[1].getName() + " " + author[1].getLastname() + ". It is sold at $" + price + ".";
    }
}
