package day14.jva8.lambda.Library;

public class Book {
    private Integer bookId;
    private String bookTitle;
    private Float bookPrice;

    public Book () {
        super();
    }

    public Book (Integer bookId, String bookTitle, Float bookPrice) {
        super();
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
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

    public Float getBookPrice () {
        return this.bookPrice;
    }

    public void setBookPrice (Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString () {
        return String.format("Book [ %3d | %-25s | %.2f]", bookId, bookTitle,  bookPrice );
    }
}
