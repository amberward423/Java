import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);

    }

    void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book title: " + books.get(i).getTitle());
            System.out.println("Author: " + books.get(i).getAuthor());
            System.out.println("Publication Year: " + books.get(i).getPublicationYear());
        }

    }

    void findBooksByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor() != null && books.get(i).getAuthor().equals(author)) {
                System.out.println("Book title: " + books.get(i).getTitle());
                System.out.println("Author: " + books.get(i).getAuthor());
                System.out.println("Publication Year: " + books.get(i).getPublicationYear());
            }
        }
    }

    void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() != null && books.get(i).getTitle().equals(title)) {
                books.remove(i);
                break;
            }
        }
    }

    void returnBook(Book book) {
        books.add(book);
    }

    boolean isBookAvailable(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() != null && books.get(i).getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    double getAverageBookRating() {
        double x = 0;
        if (books.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < books.size(); i++) {
           x += books.get(i).getRating();
        }
       return  x/books.size();
    }
     Book getMostReviewedBook(){
         if (books.isEmpty()) {
             return null;
         }
        int review = books.get(0).getReviewCount();
        Book  mostReviewedBook = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            if(books.get(i).getReviewCount() > review){
                review  = books.get(i).getReviewCount() ;
                mostReviewedBook = books.get(i);
            }
        }
         return mostReviewedBook;
     }
}




