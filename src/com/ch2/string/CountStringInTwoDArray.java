package com.ch2.string;

/**
 * Count of number of given string in 2D character array
 *
 * Difficulty Level : Medium
 * Last Updated : 01 Aug, 2022
 * Given a 2-Dimensional character array and a string, we need to find the given string in 2-dimensional character array, such that individual characters can be present left to right, right to left, top to down or down to top.
 *
 * Examples:
 *
 * Input : a ={
 *             {D,D,D,G,D,D},
 *             {B,B,D,E,B,S},
 *             {B,S,K,E,B,K},
 *             {D,D,D,D,D,E},
 *             {D,D,D,D,D,E},
 *             {D,D,D,D,D,G}
 *            }
 *         str= "GEEKS"
 * Output :2
 *
 * Input : a = {
 *             {B,B,M,B,B,B},
 *             {C,B,A,B,B,B},
 *             {I,B,G,B,B,B},
 *             {G,B,I,B,B,B},
 *             {A,B,C,B,B,B},
 *             {M,C,I,G,A,M}
 *             }
 *         str= "MAGIC"
 *
 * Output :3
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * We have discussed simpler problem to find if a word exists or not in a matrix.
 * Approach:
 *
 * To count all occurrences, we follow simple brute force approach.
 * Traverse through each character of the matrix and taking each character as a start of the string to be found.
 * Try to search in all the possible directions.
 * Whenever, a word is found, increase the count.
 *  After traversing the matrix what ever will be the value of count will be number of times string exists in character matrix.
 * Algorithm :
 *
 * Step 1– Traverse matrix character by character and take one character as string start
 * Step 2– For each character find the string in all the four directions recursively
 * Step 3– If a string found, we increase the count
 * Step 4– When we are done with one character as start, we repeat the same process for the next character
 * Step 5– Calculate the sum of count for each character
 * Step 6– Final count will be the answer
 */
public class CountStringInTwoDArray {
}
