# Lab 6 - Inheritance

This project is a basic yelp-like tool. It includes a `Resaurant` class with a constructor that allows you to create a 
restaurant with a name, rating, and price. The `Restaurant` class includes 3 methods; `toString`, `addReview`, and 
`updateStars`. A `Review` class and constructor allows you to add a restaurant-specific review that includes a rating, 
the author of the review, and the review body. The `Review` class also includes a `toString` method.

## Methods:
Restaurant :
- `toString` - This method returns a string that includes the restaurant name, rating, and price (e.g. $, $$, $$$, etc)
- `addReview` - This method takes in a `Review` object and adds it to the restaurant's reviews array list as long
as the review is for the correct restaurant.
- `updateStars` - This method will update the restaurants star rating based on the average of every reviewer's ratings.
Review :
- `toString` - This method returns a string that includes the rating, author, and the body of the review.
