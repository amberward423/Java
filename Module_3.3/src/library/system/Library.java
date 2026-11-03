package library.system;
import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryMember> members = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);

    }

    public void returnBook(LibraryMember member, Book book) {
        books.add(book);
        member.returnBook(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);

    }

    void removeMember(LibraryMember member) {
        members.remove(member);

    }
    public void borrowBook(LibraryMember member, Book book){
         if(books.contains(book)){
            member.borrowBook(book);
            books.remove(book);
        }
    }
   public int getAvailableBook(){
        return books.size();
        }
   }



