package GuiaObjetos2.ejer1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Author[] author = new Author[10];
        Author authorNicolas = new Author("Nicolas", "Tesone", "nikolastesone@gmail.com", 'M');
        Author authorOther = new Author("Other", "Author", "OtherAuthor@gmail.com", 'M');
        author[0] = authorNicolas;
        author[1] = authorOther;

        Book book = new Book("Effective Java",450,150,author);

        System.out.println(book.toString());
        System.out.println("\n antes E)");
        //e)
        System.out.println("\n E)");
        int price = book.getPrice();
        book.setPrice(500);
        System.out.println(book.toString());

        //f)
        System.out.println("\n F)");
        Author[] authorBook = book.getAuthor();
        String viewAuthorBook = Arrays.toString(authorBook);
        System.out.println(viewAuthorBook);

        //g)
        System.out.println("\n G)");
        System.out.println(book.bookSumary());


    }
}
