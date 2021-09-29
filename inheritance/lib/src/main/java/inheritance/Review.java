package inheritance;

public class Review {

    String body;
    String author;
    int stars;
    Restaurant restaurant;
    Shop shop;
    Theater theater;
    String movie;

    public Review (String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    public Review (String body, String author, int stars, Shop shop) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.shop = shop;
    }

    public Review (String body, String author, int stars, Theater theater) {
        this(body, author, stars, theater, null);
    }

    public Review (String body, String author, int stars, Theater theater, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.theater = theater;
        this.movie = movie;
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
        if (this.movie != null) {
            output += "I watched: " + this.movie + "\n";
        }
        return output;
    }
}
