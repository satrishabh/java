package com.ch5.binarytrees;

/**
 * Construct Binary Tree from String with bracket representation
 *
 * Difficulty Level : Medium
 * Last Updated : 04 May, 2022
 * Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the root’s value and a pair of parenthesis contains a child binary tree with the same structure. Always start to construct the left child node of the parent first if it exists.
 *
 * Examples:
 *
 * Input : "1(2)(3)"
 * Output : 1 2 3
 * Explanation :
 *            1
 *           / \
 *          2   3
 * Explanation: first pair of parenthesis contains
 * left subtree and second one contains the right
 * subtree. Preorder of above tree is "1 2 3".
 *
 * Input : "4(2(3)(1))(6(5))"
 * Output : 4 2 3 1 6 5
 * Explanation :
 *            4
 *          /   \
 *         2     6
 *        / \   /
 *       3   1 5
 * We know first character in string is root. Substring inside the first adjacent pair of parenthesis is for left subtree and substring inside second pair of parenthesis is for right subtree as in the below diagram.
 *
 *
 *
 * We need to find the substring corresponding to left subtree and substring corresponding to right subtree and then recursively call on both of the substrings.
 *
 * For this first find the index of starting index and end index of each substring.
 * To find the index of closing parenthesis of left subtree substring, use a stack. Let the found index be stored in index variable.
 */
public class ConstructBinaryTree {
}
