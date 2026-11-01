
public class Book {

    private String title;
    private String author;
    private int publication_year;
    private double rating;

    public Book(String title, String author, int publication_year) {
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
    }
   String getTitle(){
        return title;
}

    String getAuthor(){
        return author;
    }

    int getPublicationYear(){
        return publication_year;
    }

    void setRating(double rating){
        this.rating = rating;
    }


}
