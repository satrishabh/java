package com.ch1.array;

/**
 * Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
 *
 * Difficulty Level : Medium
 * Last Updated : 01 Aug, 2022
 * Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by a negative and vice-versa maintaining the order of appearance. The number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear at the end of the array.
 *
 * Examples:
 *
 * Input:  arr[] = {1, 2, 3, -4, -1, 4}
 * Output: arr[] = {-4, 1, -1, 2, 3, 4}
 *
 * Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
 * Output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
 *
 * This question has been asked in many places (See this and this)
 *
 *
 * Complete Interview Preparation - GFG
 *
 * Naive Approach:
 * The above problem can be easily solved if O(n) extra space is allowed.
 *
 * We can store the positive values and negative values in two separate data structures.
 * We will start filling the original array with alternating negative and positive values in the same order
 * in which it appears in the original array.
 * It becomes interesting due to the limitations that O(1) extra space and order of appearances.
 *
 * Optimal Approach:
 * The idea is to process the array from left to right. While processing, find the first out-of-place element in the remaining unprocessed array. An element is out of place if it is negative and at odd index (0-based index), or if it is positive and at even index (0-based index). Once we find an out-of-place element, we find the first element after it with an opposite sign. We right rotate the subarray between these two elements (including these two).
 *
 * Illustration:
 *
 * Let the array be arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 }
 *
 * First iteration:
 *
 * { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 } , -2 appears on odd index position and is out of place.
 * We will look for the first element that appears with an opposite sign
 * { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 } => perform rotation of subarray between this two elements
 * { -5, 5, -2, 2, 4, 7, 1, 8, 0, -8 }
 * Second iteration:
 *
 * { -5, 5, -2, 2, 4, 7, 1, 8, 0, -8 } , 4 is out of place.
 * { -5, 5, -2, 2, 4, 7, 1, 8, 0, -8 } =>-8 is of diffenrent sign
 * { -5, 5, -2, 2, -8, 4, 7, 1, 8, 0 } => after performing right rotation between 4 to -8
 * Algorithm:
 * We will maintain a variable to mark if the element is in its correct position or not. Let the variable be outofplace. Initiall it is -1.
 *
 * We will iterate over the array
 * If outofplace is -1, we will check if the current index is out of place.
 * If the current index is out of place we will update the outofplace with the index value.
 * Else we will keep the value as it is.
 * If the outofplace is not -1, we will search for the next index which has a different sign than that of the value that is present in outofplace position.
 * Now we will pass this two positions to right rotate our array.
 * Update the value of outofplace by 2 unit.
 * Following is the implementation of the above idea.
 */
public class RearrangeArray {
}
