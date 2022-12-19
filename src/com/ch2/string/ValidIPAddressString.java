package com.ch2.string;

/**
 * Program to generate all possible valid IP addresses from given string
 *
 * Difficulty Level : Hard
 * Last Updated : 28 Jul, 2022
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * A valid IP address must be in the form of A.B.C.D, where A, B, C, and D are numbers from 0-255. The numbers cannot be 0 prefixed unless they are 0.
 *
 * Examples :
 *
 * Input: 25525511135
 * Output: [“255.255.11.135”, “255.255.111.35”]
 * Explanation:
 * These are the only valid possible
 * IP addresses.
 *
 * Input: "25505011535"
 * Output: []
 * Explanation:
 * We cannot generate a valid IP
 * address with this string.
 * First, we will place 3 dots in the given string and then try out all the possible combinations for the 3 dots.
 * Corner case for validity:
 *
 * For string "25011255255"
 * 25.011.255.255 is not valid as 011 is not valid.
 * 25.11.255.255 is not valid either as you are not
 * allowed to change the string.
 * 250.11.255.255 is valid.
 * Recommended Practice
 * Generate IP Addresses
 * Try It!
 * Approach: Split the string with ‘ . ‘ and then check for all corner cases. Before entering the loop, check the size of the string. Generate all the possible combinations using looping through the string. If IP is found to be valid then return the IP address, else simply return the empty list.
 * Below is the implementation of the above approach:
 */
public class ValidIPAddressString {
}
