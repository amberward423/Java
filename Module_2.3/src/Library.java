import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);

    }

    void addUser(User user) {
        users.add(user);
    }

    void removeUser(User user) {
        users.remove(user);
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
        return x / books.size();
    }

    Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        int review = books.get(0).getReviewCount();
        Book mostReviewedBook = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            if (books.get(i).getReviewCount() > review) {
                review = books.get(i).getReviewCount();
                mostReviewedBook = books.get(i);
            }
        }
        return mostReviewedBook;
    }

    User findUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                return users.get(i);
            }

        }
        return null;
    }

    void displayUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.print("Name: " + users.get(i).getName());
            System.out.print("Age: " + users.get(i).getAge());
        }

    }

    void borrowBook(User user, Book book) {
        if (users.contains(user)) {
            user.borrowBook(book);
        }
    }

    void returnBook(User user, Book book) {
        if (users.contains(user)) {
            user.returnBook(book);
        }
    }
}



