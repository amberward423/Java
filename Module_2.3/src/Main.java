public class Main {
    public static void main(String[] args) {
        Library myLibrary;

        myLibrary = new Library();

        Book book1;

        book1 = new Book("Cat in the Hat", "Dr.Suess",1957 );

        myLibrary.addBook(book1);
        myLibrary.displayBooks();

        Book book2;

        book2 = new Book("Oh the Places You'll Go", "Dr.Suess",1990 );

        myLibrary.addBook(book2);
        myLibrary.displayBooks();
        myLibrary.findBooksByAuthor("Dr.Suess");
    }

    }
