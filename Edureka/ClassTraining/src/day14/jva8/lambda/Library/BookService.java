package day14.jva8.lambda.Library;

import java.util.Collections;
import java.util.List;

public class BookService {
    public List<Book> getBooksInOrderOfBOOKId(){
        List<Book> books = new BookDAO().getAllBooks();

        Collections.sort(books, (newBook, existingBook) -> newBook.getBookId() - existingBook.getBookId());

        return books;
    }
}
