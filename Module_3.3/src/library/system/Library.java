package library.system;
import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryMember> members = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);

    }

    void returnBook(Book book) {
        books.add(book);

    }

    void addMember(LibraryMember member) {
        members.add(member);

    }

    void removeMember(LibraryMember member) {
        members.remove(member);

    }
    void borrowBook(LibraryMember member,Book book){
         member.borrowBook(book);
         books.remove(book);
    }
}
