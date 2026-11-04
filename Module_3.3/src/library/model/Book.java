package library.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean reserved;

    public Book(String title, String author, String ISBN, boolean reserved) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.reserved= reserved;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }

    public boolean isReserved() {
        return reserved;
    }
    public void setReserved(boolean reserved){
        this.reserved = reserved;
    }
}