package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    String name;
    float stars;
    int price;
    List<Review> reviews = new ArrayList<>();
    float totalStars;
    float numReviews;

    public Restaurant (String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }
    @Override
    public String toString() {
        String output = "";
        output += "Name: " + this.name + "\n";
        if (this.stars == 1) {
            output += "Rating: " + this.stars + " Star\n";
        } else {
            output += "Rating: " + this.stars + " Stars\n";
        }
        String dollarSign = "$";
        String price = dollarSign.repeat(this.price);
        output += "Price: " + price + "\n";
        return output;
    }

    public void addReview(Review review) {
        if (review.restaurant.name == this.name){
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
