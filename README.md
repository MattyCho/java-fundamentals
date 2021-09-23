# java-fundamentals

## Lab 1 - basics directory
- Main.java includes 3 methods: Pluralize, flipNHeads, and clock
- Pluralize - takes in 2 arguments, a word and a count, and will pluralize the word based on the count.
- flipNHeads - takes in one integer as an argument and will "flip a coin" until the program gets the required number of heads in a row
- clock - prints the local time every second.

## Lab 2 - basiclibrary directory
- lib/src/main/java/Library.java includes 4 methods: roll, containsDuplicate, average, and arrayOfArrays
- roll takes an integer and will roll a six-sided dice that amount of times.
- containsDuplicate takes an array of integers and returns a true or false value based on whether or not the array contains a duplicate value.
- average takes an array of integers and calculates the total average of every value in the array.
- arrayOfArrays takes and array of arrays and returns the single array with the lowest average value.
- lib/src/test//java/LibraryTest.Java contains test values for each method in Library.java.

## Lab 3 - basiclibrary
- added 3 more methods: binarysearch, analyzingweatherdata, tally.
- binarysearch, uses the binary search algorithm to look through an array for a target value and returns the index of that value. If that value doesn't exist in the array it will return -1.
- analyzingweatherdata uses a 2D array and will return the highest and lowest temperature as well as every temperature in between that did not appear in the array.
- tally takes a list and returns the element that appeared the most.