package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    String name;
    List<Review> reviews = new ArrayList<>();
    List<String> movies = new ArrayList<>();
    float stars;
    float totalStars;
    float numReviews;


    public Theater(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Name: " + this.name + "\n";
        output += "Rating: " + this.stars + "\n";
        output += "Movies currently airing: " + this.movies + "\n";
        return output;
    }

    public void addMovie(String movieName) {
        movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        movies.remove(movieName);
    }

    public void addReview(Review review) {
        if (review.theater.name == this.name){
            reviews.add(review);
            numReviews++;
            totalStars += review.stars;
            this.updateStars();
        } else {
            System.out.println("Error! This review is for another restaurant.");
        }
    }

    public void updateStars() {
        this.stars = totalStars/numReviews;
    }
}
