package com.ch5.binarytrees;

/**
 * Maximum sum of nodes in Binary tree such that no two are adjacent
 *
 * Difficulty Level : Hard
 * Last Updated : 01 Aug, 2022
 * Given a binary tree with a value associated with each node, we need to choose a subset of these nodes such that the sum of selected nodes is maximum under a constraint that no two chosen nodes in the subset should be directly connected, that is, if we have taken a node in our sum then we can’t take any of its children in consideration and vice versa.
 *
 * Examples:
 *
 *
 *
 * In the above binary tree, chosen nodes are encircled
 * and are not directly connected, and their sum is
 * maximum possible.
 * Recommended: Please solve it on “PRACTICE” first before moving on to the solution.
 *
 * Method 1
 * We can solve this problem by considering the fact that both node and its children can’t be in sum at the same time, so when we take a node into our sum, we will call recursively for its grandchildren or if we don’t take this node then we will call for all its children nodes and finally we will choose maximum from both of the results.
 * It can be seen easily that the above approach can lead to solving the same subproblem many times, for example in the above diagram node 1 calls node 4 and 5 when its value is chosen and node 3 also calls them when its value is not chosen so these nodes are processed more than once. We can stop solving these nodes more than once by memorizing the result at all nodes.
 * In the below code, a map is used for memorizing the result, which stores the development of the complete subtree rooted at a node in the map so that if it is called again, the value is not calculated again instead stored value from the map is returned directly.
 *
 * Please see the below code for a better understanding.
 */
public class MaximumSumOfNodes {
}
