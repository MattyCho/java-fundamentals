package inheritance;

public class Review {

    String body;
    String author;
    int stars;
    Restaurant restaurant;

    public Review (String body, String author, int stars, Restaurant rest) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = rest;
    }

    @Override
    public String toString() {
        String output = "";
        if (this.stars == 1) {
            output += "Rating: " + this.stars + " Star\n";
        } else {
            output += "Rating: " + this.stars + " Stars\n";
        }
        output += "Review by: " + this.author + "\n";
        output += "Review: " + this.body + "\n";
        return output;
    }
}
