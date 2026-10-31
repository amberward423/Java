import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book){
        books.add(book);

    }
    void displayBooks(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book title: " + books.get(i).getTitle());
            System.out.println("Author: " + books.get(i).getAuthor());
            System.out.println("Publication Year: " + books.get(i).getPublicationYear());
        }

    }
    void findBooksByAuthor(String author){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getAuthor() != null && books.get(i).getAuthor().equals(author)){
                System.out.println("Book title: " + books.get(i).getTitle());
                System.out.println("Author: " + books.get(i).getAuthor());
                System.out.println("Publication Year: " + books.get(i).getPublicationYear());
            }
        }
    }
}
