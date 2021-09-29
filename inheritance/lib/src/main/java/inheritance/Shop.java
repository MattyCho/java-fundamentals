package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    String name;
    String description;
    int price;
    float stars;
    List<Review> reviews = new ArrayList<>();
    float totalStars;
    float numReviews;

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Name: " + this.name + "\n";
        output += "Description: " + this.description + "\n";
        output += "Rating: " + this.stars + "\n";
        String dollarSign = "$";
        String price = dollarSign.repeat(this.price);
        output += "Price: " + price + "\n";
        return output;
    }

    public void addReview(Review review) {
        if (review.shop.name == this.name){
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
