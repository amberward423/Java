import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    void borrowBook(Book book){
        borrowedBooks.add(book);
    }


    void returnBook(Book book){
        borrowedBooks.remove(book);
    }
}
