package com.ch5.binarytrees;

/**
 * Find largest subtree sum in a tree
 *
 * Difficulty Level : Easy
 * Last Updated : 17 Jul, 2022
 * Given a binary tree, task is to find subtree with maximum sum in tree.
 * Examples:
 *
 *
 * Input :       1
 *             /   \
 *            2      3
 *           / \    / \
 *          4   5  6   7
 * Output : 28
 * As all the tree elements are positive,
 * the largest subtree sum is equal to
 * sum of all tree elements.
 *
 * Input :       1
 *             /    \
 *           -2      3
 *           / \    /  \
 *          4   5  -6   2
 * Output : 7
 * Subtree with largest sum is :  -2
 *                              /  \
 *                             4    5
 * Also, entire tree sum is also 7.
 *
 *
 * equal to sum of all
 * Pause
 *
 * Unmute
 * Remaining Time-5:31
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * Recommended : Please try your approach first on IDE and then look at the solution.
 * Approach : Do post order traversal of the binary tree. At every node, find left subtree value and right subtree value recursively. The value of subtree rooted at current node is equal to sum of current node value, left node subtree sum and right node subtree sum. Compare current subtree sum with overall maximum subtree sum so far.
 * Implementation :
 *
 */
public class LargestSubTreeSumInTree {
}
