package GuiaObjetos2.ejer1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Author[] author = new Author[10];
        Book book = new Book();

        //a)
        author[0].setName("Joshua");
        author[0].setLastname("Bloch");
        author[0].setGender('M');
        author[0].setEmail("joshua@gmail.com");
        //b)
        System.out.println(author[0].toString());
        //c)
        book.setAuthor(author);
        book.setTitle("Effective Java");
        book.setPrice(450);
        book.setStock(150);
        //d)
        System.out.println(book.toString());
        //e)
        book.setPrice(500);
        System.out.println(book.toString());
        //f)
        Author[] authorBook = book.getAuthor();
        String viewAuthorBook = Arrays.toString(authorBook);
        System.out.println(viewAuthorBook);
        //g)
        System.out.println(book.bookSumary());
        //h)
        author[1].setName("Nicolas");
        author[1].setLastname("Tesone");
        author[1].setGender('M');
        author[1].setEmail("nicot@gmail.com");

    }
}
