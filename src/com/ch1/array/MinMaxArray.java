package com.ch1.array;

/**
 * Maximum and minimum of an array using minimum number of comparisons
 *
 * Write a C function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.
 *
 * Recommended Practice
 * Max Min
 * Try It!
 * First of all, how do we return multiple values from a C function? We can do it either using structures or pointers.
 * We have created a structure named pair (which contains min and max) to return multiple values.
 *
 * struct pair {
 *     int min;
 *     int max;
 * };
 *
 * // This code contributed by Aarti_Rathi
 * And the function declaration becomes: struct pair getMinMax(int arr[], int n) where arr[] is the array of size n whose minimum and maximum are needed.
 *
 *
 * Complete Interview Preparation - GFG
 *
 * METHOD 1 (Simple Linear Search)
 * Initialize values of min and max as minimum and maximum of the first two elements respectively. Starting from 3rd, compare each element with max and min, and change max and min accordingly (i.e., if the element is smaller than min then change min, else if the element is greater than max then change max, else ignore the element)
 */
public class MinMaxArray {
}
