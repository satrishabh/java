package com.ch5.binarytrees;

/**
 * Diagonal Traversal of Binary Tree
 *
 * Difficulty Level : Medium
 * Last Updated : 28 Jul, 2022
 * Consider lines with a slope of -1 that cross through nodes. Print all diagonal elements in a binary tree that belong to the same line, given a binary tree.
 *
 * Input : Root of below tree
 * unnamed
 *
 * Output :
 * Diagonal Traversal of binary tree:
 *  8 10 14
 *  3 6 7 13
 *  1 4
 * Observation : root and root->right values will be prioritized over all root->left values.
 * Recommended PracticeDiagonal Traversal of Binary TreeTry It!
 * The plan is to make use of a map. Different slope distances are used in the map as a key. The map’s value is a node vector (or dynamic array). To save values in the map, we traverse the tree. We print the contents of the map after it has been constructed.
 *
 * Below is the implementation of the above idea.
 */
public class DiagonalTraversalOfBinaryTree {
}
