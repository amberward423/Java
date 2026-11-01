import java.util.ArrayList;

public class Book {
    private ArrayList<String> reviews = new ArrayList<>();

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
    void addReview(String review) {
        reviews.add(review);

    }

    double getRating(){
        return rating;
    }
}
