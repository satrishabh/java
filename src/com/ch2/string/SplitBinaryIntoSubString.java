package com.ch2.string;

/**
 * Split the binary string into substrings with equal number of 0s and 1s
 *
 * Difficulty Level : Easy
 * Last Updated : 26 Nov, 2021
 * Given a binary string str of length N, the task is to find the maximum count of consecutive substrings str can be divided into such that all the substrings are balanced i.e. they have equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then print -1.
 * Example:
 *
 *
 * Input: str = “0100110101”
 * Output: 4
 * The required substrings are “01”, “0011”, “01” and “01”.
 * Input: str = “0111100010”
 * Output: 3
 *
 * Input: str = “0000000000”
 *
 * Output: -1
 *
 *
 *
 *
 * Recommended Practice
 * Split the binary string into substrings with equal number of 0s and 1s
 * Try It!
 * Approach: Initialize count = 0 and traverse the string character by character and keep track of the number of 0s and 1s so far, whenever the count of 0s and 1s become equal increment the count. As in the given question, if it is not possible to split string then on that time count of 0s must not be equal to count of 1s then return -1 else print the value of count after the traversal of the complete string.
 * Below is the implementation of the above approach:
 *
 */
public class SplitBinaryIntoSubString {
}
