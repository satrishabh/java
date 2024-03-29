package com.ch5.binarytrees;

/**
 * Postorder Tree Traversal – Iterative and Recursive
 * Given a binary tree, write an iterative and recursive solution to traverse the tree using postorder traversal in C++, Java, and Python.
 *
 * Unlike linked lists, one-dimensional arrays, and other linear data structures, which are traversed in linear order, trees can be traversed in multiple ways in depth–first order (preorder, inorder, and postorder) or breadth–first order (level order traversal). Beyond these basic traversals, various more complex or hybrid schemes are possible, such as depth-limited searches like iterative deepening depth–first search. In this post, postorder tree traversal is discussed in detail.
 *
 *
 *
 * Traversing a tree involves iterating over all nodes in some manner. As the tree is not a linear data structure, there can be more than one possible next node from a given node, so some nodes must be deferred, i.e., stored in some way for later visiting. The traversal can be done iteratively where the deferred nodes are stored in the stack, or it can be done by recursion, where the deferred nodes are stored implicitly in the call stack.
 *
 * For traversing a (non-empty) binary tree in a postorder fashion, we must do these three things for every node n starting from the tree’s root:
 *
 * (L) Recursively traverse its left subtree. When this step is finished, we are back at n again.
 * (R) Recursively traverse its right subtree. When this step is finished, we are back at n again.
 * (N) Process n itself.
 *
 * In normal postorder traversal, visit the left subtree before the right subtree. If we visit the right subtree before visiting the left subtree, it is referred to as reverse postorder traversal.
 *
 * Postorder Traversal
 *
 * Practice this problem
 *
 * Recursive Implementation
 * As we can see, before processing any node, the left subtree is processed first, followed by the right subtree, and the node is processed at last. These operations can be defined recursively for each node. The recursive implementation is referred to as a Depth–first search (DFS), as the search tree is deepened as much as possible on each child before going to the next sibling.
 *
 * Following is the C++, Java, and Python program that demonstrates it:
 */
public class PostOrderTraversal {
}
