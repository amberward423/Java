import library.system.Library;
import library.model.Book;
import library.model.LibraryMember;

public class Main {
    public static void main(String[] args) {
            Library library = new Library();
            Book book = new Book("The Hobbit","J.R.R Tolkien","1AFGTF5");
            LibraryMember librarymember = new LibraryMember("Amber",1);

            library.addBook(book);
            library.addMember(librarymember);
            library.borrowBook(librarymember,book);

            System.out.println(librarymember.getName());
        System.out.println(librarymember.getName());
        System.out.println(library.getAvailableBook());
        library.returnBook(librarymember,book);
        System.out.println(library.getAvailableBook());





    }

    }
