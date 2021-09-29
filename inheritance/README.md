# Lab 6 - Inheritance

This project is a basic yelp-like tool. It includes a `Resaurant` class with a constructor that allows you to create a 
restaurant with a name, rating, and price. The `Restaurant` class includes 3 methods; `toString`, `addReview`, and 
`updateStars`. A `Review` class and constructor allows you to add a restaurant-specific review that includes a rating, 
the author of the review, and the review body. The `Review` class also includes a `toString` method.

## Methods:
**Restaurant** :
- `toString` - This method returns a string that includes the restaurant name, rating, and price (e.g. $, $$, $$$, etc)
- `addReview` - This method takes in a `Review` object and adds it to the restaurant's reviews array list as long
as the review is for the correct restaurant.
- `updateStars` - This method will update the restaurants star rating based on the average of every reviewer's ratings.
**Review** :
- `toString` - This method returns a string that includes the rating, author, and the body of the review.

# Lab 7 - Inheritance Part 2
Added separate classes for `Shop` and `Theater`. They both have the same functionality as the `Restaurant` class.
Reviews are specific to each `Restaurant`, `Shop`, and `Theater`. Reviews for a `Theater` may also include the name of 
the movie the reviewer watch. Shops will also include a short description. Theaters will include an array of currently
airing movies.

## Methods:
**Shop** : 
- `toString`, `addReview`, `updateStars` - All work similar to the `Restaurant` class with minor changes.

**Theater** : 
- `toString`, `addReview`, `updateStars` - All work similar to the `Restaurant` class with minor changes.
- `addMovie` and `removeMovie` - These methods use .add or .remove to add a string of a movie name to the 
theater's currently airing movie ArrayList.