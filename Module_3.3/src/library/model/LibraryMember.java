package library.model;

import java.util.ArrayList;

public class LibraryMember {
   private  ArrayList<Book> borrowedBooks = new ArrayList<>();
    private int memberID;
    private String name;

    public LibraryMember(String name,int memberID) {
        this.name = name;
        this.memberID = memberID;
    }
    public String getName(){
        return name;
    }
    public int getMemberID(){
        return memberID;
    }
    void borrowBook(Book book) {
        borrowedBooks.add(book);

    }
    void returnBook(Book book) {
        borrowedBooks.remove(book);

    }
}
