package day7.libraryProject;

public class Book {
    private Integer bookId;
    private String bookTitle;

    Book(){

    }

    Book(int bookId, String bookTitle){
        super();
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }

    public Integer getBookId () {
        return this.bookId;
    }

    public void setBookId (Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle () {
        return this.bookTitle;
    }

    public void setBookTitle (String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString () {
        return String.format("Book [%6d ---> %-22s]", bookId, bookTitle);
    }


//    @Override
//    public String toString () {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", bookTitle='" + bookTitle + '\'' +
//                '}';
//    }
}
