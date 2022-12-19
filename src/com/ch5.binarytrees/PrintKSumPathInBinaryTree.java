package com.ch5.binarytrees;

/**
 * Print all k-sum paths in a binary tree
 *
 * Difficulty Level : Hard
 * Last Updated : 07 Jul, 2022
 * A binary tree and a number k are given. Print every path in the tree with sum of the nodes in the path as k.
 * A path can start from any node and end at any node and must be downward only, i.e. they need not be root node and leaf node; and negative numbers can also be there in the tree.
 *
 * Examples:
 *
 * tree, which has some equal to
 * Pause
 *
 * Unmute
 * Remaining Time-6:06
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * Input : k = 5
 *         Root of below binary tree:
 *            1
 *         /     \
 *       3        -1
 *     /   \     /   \
 *    2     1   4     5
 *         /   / \     \
 *        1   1   2     6
 *
 * Output :
 * 3 2
 * 3 1 1
 * 1 3 1
 * 4 1
 * 1 -1 4 1
 * -1 4 2
 * 5
 * 1 -1 5
 * Source : Amazon Interview Experience Set-323
 *
 * Recommended PracticePlease try your approach on {IDE} first, before moving on to the solution.Try It!
 * Kindly note that this problem is significantly different from finding k-sum path from root to leaves. Here each node can be treated as root, hence the path can start and end at any node.
 * The basic idea to solve the problem is to do a preorder traversal of the given tree. We also need a container (vector) to keep track of the path that led to that node. At each node we check if there are any path that sums to k, if any we print the path and proceed recursively to print each path.
 *
 * Below is the implementation of the same.
 */
public class PrintKSumPathInBinaryTree {
}
