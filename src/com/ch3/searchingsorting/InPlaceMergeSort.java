package com.ch3.searchingsorting;

/**
 * In-Place Merge Sort
 *
 * Difficulty Level : Hard
 * Last Updated : 11 Jul, 2022
 * Implement Merge Sort i.e. standard implementation keeping the sorting algorithm as in-place.
 * In-place means it does not occupy extra memory for merge operation as in the standard case.
 *
 * Examples:
 *
 * Input: arr[] = {2, 3, 4, 1}
 * Output: 1 2 3 4
 *
 * Input: arr[] = {56, 2, 45}
 * Output: 2 45 56
 *
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 *
 * Approach 1:
 *
 * Maintain two pointers that point to the start of the segments which have to be merged.
 * Compare the elements at which the pointers are present.
 * If element1 < element2 then element1 is at right position, simply increase pointer1.
 * Else shift all the elements between element1 and element2(including element1 but excluding element2) right by 1 and then place the element2 in the previous place(i.e. before shifting right) of element1. Increment all the pointers by 1.
 */
public class InPlaceMergeSort {
}
