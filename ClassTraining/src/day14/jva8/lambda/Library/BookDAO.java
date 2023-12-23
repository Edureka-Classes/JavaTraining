package day14.jva8.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();

        books.add(new Book(365, "Java Reference", 525.50f));
        books.add(new Book(225, "Python Reference", 330f));
        books.add(new Book(926, "Angular Referencw", 725.75f));
        books.add(new Book(123, "Spring Reference", 745f));
        books.add(new Book(224, "Microsrvice Reference", 950f));

        return books;

    }
}
