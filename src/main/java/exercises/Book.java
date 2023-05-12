package exercises;

public class Book {
    private String title;
    private String isbn;
    private int year;
    private String author;

    public Book(String title, String isbn, String author, int year){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }
}
