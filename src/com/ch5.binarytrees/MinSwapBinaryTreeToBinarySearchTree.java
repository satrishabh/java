package com.ch5.binarytrees;

/**
 * Minimum swap required to convert binary tree to binary search tree
 *
 * Difficulty Level : Hard
 * Last Updated : 28 Jul, 2022
 * Given the array representation of Complete Binary Tree i.e, if index i is the parent, index 2*i + 1 is the left child and index 2*i + 2 is the right child. The task is to find the minimum number of swap required to convert it into Binary Search Tree.
 *
 * Examples:
 *
 * Input : arr[] = { 5, 6, 7, 8, 9, 10, 11 }
 * Output : 3
 * Binary tree of the given array:
 * dig11
 *
 * Swap 1: Swap node 8 with node 5.
 * Swap 2: Swap node 9 with node 10.
 * Swap 3: Swap node 10 with node 7.
 * dig21
 *
 * So, minimum 3 swaps are required.
 *
 *
 * Input : arr[] = { 1, 2, 3 }
 * Output : 1
 * Binary tree of the given array:
 * dig3
 *
 * After swapping node 1 with node 2.
 * dig41
 *
 * So, only 1 swap required.
 * Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
 *
 * The idea is to use the fact that inorder traversal of Binary Search Tree is in increasing order of their value.
 * So, find the inorder traversal of the Binary Tree and store it in the array and try to sort the array. The minimum number of swap required to get the array sorted will be the answer. Please refer below post to find minimum number of swaps required to get the array sorted.
 * Minimum number of swaps required to sort an array
 *
 * Time Complexity: O(n log n).
 */
public class MinSwapBinaryTreeToBinarySearchTree {
}
