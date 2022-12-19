package com.ch2.string;

/**
 * Recursively print all sentences that can be formed from list of word lists
 *
 * Difficulty Level : Medium
 * Last Updated : 27 Jun, 2022
 * Given a list of word lists How to print all sentences possible taking one word from a list at a time via recursion?
 *
 * Example:
 *
 * Input: {{"you", "we"},
 *         {"have", "are"},
 *         {"sleep", "eat", "drink"}}
 *
 * Output:
 *   you have sleep
 *   you have eat
 *   you have drink
 *   you are sleep
 *   you are eat
 *   you are drink
 *   we have sleep
 *   we have eat
 *   we have drink
 *   we are sleep
 *   we are eat
 *   we are drink
 * We strongly recommend minimizing your browser and try this yourself first.
 * The idea is based on a simple depth-first traversal. We start from every word of the first list as the first word of an output sentence, then recur for the remaining lists.
 */
public class RecursiveList {
}
