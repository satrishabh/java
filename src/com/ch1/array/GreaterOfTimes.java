package com.ch1.array;

/**
 * Given an array of size n and a number k, find all elements that appear more than n/k times
 *
 * Difficulty Level : Medium
 * Last Updated : 13 Jul, 2022
 * Given an array of size n, find all elements in array that appear more than n/k times. For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, then the output should be [2, 3]. Note that size of array is 8 (or n = 8), so we need to find all elements that appear more than 2 (or 8/4) times. There are two elements that appear more than two times, 2 and 3.
 *
 * A simple method is to pick all elements one by one. For every picked element, count its occurrences by traversing the array, if count becomes more than n/k, then print the element. Time Complexity of this method would be O(n2.
 */
public class GreaterOfTimes {
}
