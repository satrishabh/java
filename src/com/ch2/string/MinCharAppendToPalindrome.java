package com.ch2.string;

/**
 * Minimum characters to be added at front to make string palindrome
 *
 * Difficulty Level : Hard
 * Last Updated : 28 Jul, 2022
 * Given a string str we need to tell minimum characters to be added at front of string to make string palindrome.
 * Examples:
 *
 *
 * Input  : str = "ABC"
 * Output : 2
 * We can make above string palindrome as "CBABC"
 * by adding 'B' and 'C' at front.
 *
 * Input  : str = "AACECAAAA";
 * Output : 2
 * We can make above string palindrome as AAAACECAAAA
 * by adding two A's at front of string.
 *
 *
 * Recommended Practice
 * Minimum characters to be added at front to make string palindrome
 * Try It!
 * Naive approach: Start checking the string each time if it is a palindrome and if not, then delete the last character and check again. When the string gets reduced to wither a palindrome or empty then the number of characters deleted from the end till now will be the answer as those characters could have been inserted at the beginning of the original string in the order which will  make the string a palindrome.
 * Below is the implementation of the above approach:
 */
public class MinCharAppendToPalindrome {
}
