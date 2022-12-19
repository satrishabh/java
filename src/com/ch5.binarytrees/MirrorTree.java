package com.ch5.binarytrees;

/**
 * Create a mirror tree from the given binary tree
 *
 * Difficulty Level : Easy
 * Last Updated : 12 Oct, 2021
 * Given a binary tree, the task is to create a new binary tree which is a mirror image of the given binary tree.
 *
 * Examples:
 *
 * Input:
 *         5
 *        / \
 *       3   6
 *      / \
 *     2   4
 * Output:
 * Inorder of original tree: 2 3 4 5 6
 * Inorder of mirror tree: 6 5 4 3 2
 * Mirror tree will be:
 *   5
 *  / \
 * 6   3
 *    / \
 *   4   2
 *
 * Input:
 *         2
 *        / \
 *       1   8
 *      /     \
 *     12      9
 * Output:
 * Inorder of original tree: 12 1 2 8 9
 * Inorder of mirror tree: 9 8 2 1 12
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * Approach: Write a recursive function that will take two nodes as the argument, one of the original tree and the other of the newly created tree. Now, for every passed node of the original tree, create a corresponding node in the mirror tree and then recursively call the same method for the child nodes but passing the left child of the original tree node with the right child of the mirror tree node and the right child of the original tree node with the left child of the mirror tree node.
 *
 * Below is the implementation of the above approach:
 */
public class MirrorTree {
}
