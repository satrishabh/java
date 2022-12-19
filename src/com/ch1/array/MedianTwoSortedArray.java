package com.ch1.array;

/**
 * Median of two sorted arrays of different sizes
 *
 * Difficulty Level : Expert
 * Last Updated : 29 Jul, 2022
 * Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays, in O(log n + log m) time complexity, when n is the number of elements in the first array, and m is the number of elements in the second array.
 * This is an extension of median of two sorted arrays of equal size problem. Here we handle arrays of unequal size also.
 *
 * Example:
 *
 * <a href="https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/">...</a>
 * Pause
 *
 * Unmute
 * Remaining Time-25:07
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * Click here for the Complete Course!
 * Input: ar1[] = {-5, 3, 6, 12, 15}
 *         ar2[] = {-12, -10, -6, -3, 4, 10}
 * Output : The median is 3.
 * Explanation : The merged array is :
 *         ar3[] = {-12, -10, -6, -5 , -3,
 *                  3, 4, 6, 10, 12, 15},
 *        So the median of the merged array is 3
 *
 * Input: ar1[] = {2, 3, 5, 8}
 *         ar2[] = {10, 12, 14, 16, 18, 20}
 * Output : The median is 11.
 * Explanation : The merged array is :
 *         ar3[] = {2, 3, 5, 8, 10, 12, 14, 16, 18, 20}
 *         if the number of the elements are even,
 *         so there are two middle elements,
 *         take the average between the two :
 *         (10 + 12) / 2 = 11.
 *
 * Approach 1 (Simple Mathematical Approach):
 * The given two arrays are sorted, so we need to merge them into a third array.
 *
 * Case 1: If the length of the third array is odd, then the median is at (length)/2th index in the array obtained after merging both the arrays.
 * Case 2: If the length of the third array is even, then the median will be the average of elements at index ((length)/2 ) and ((length)/2 – 1) in the array obtained after merging both the arrays.
 * Illustration:
 *
 * arr1[] = { -5, 3, 6, 12, 15 } , arr2[] = { -12, -10, -6, -3, 4, 10 }
 *
 * After merging them in a third array : arr3[] = { -5, 3, 6, 12, 15, -12, -10, -6, -3, 4, 10}
 * Sort arr3[ ] = { -12, -10, -6, -5, -3, 3, 4, 6, 10, 12, 15 }
 * As the length of arr3 is odd, so the median is 3
 * Algorithm:
 *
 * Merge the two given arrays into one array.
 * Then sort the third(merged) array
 * If the length of the third array is even then : divide the length of array by 2 return arr[value]  + arr[value – 1] / 2
 * If the length of the third array is odd then: divide the length of the array by 2 round that value returns the arr[value]
 */
public class MedianTwoSortedArray {
}
