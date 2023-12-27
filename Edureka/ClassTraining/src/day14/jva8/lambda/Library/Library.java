package day14.jva8.lambda.Library;

import java.util.List;

public class Library {
    public static void main (String[] args) throws InterruptedException {
        BookService libService = new BookService();

        List<Book> books = libService.getBooksInOrderOfBOOKId();

        /*
        for (Book bk : books){
            System.out.println(bk);
            Thread.sleep(1000);
        }
        */

        books.forEach(bk -> System.out.println(bk));
    }
}
