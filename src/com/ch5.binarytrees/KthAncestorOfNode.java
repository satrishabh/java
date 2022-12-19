package com.ch5.binarytrees;

/**
 * Kth ancestor of a node in binary tree | Set 2
 *
 * Difficulty Level : Medium
 * Last Updated : 20 Jul, 2022
 * Given a binary tree in which nodes are numbered from 1 to n. Given a node and a positive integer K. We have to print the Kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then print -1.
 * For example in the below given binary tree, the 2nd ancestor of 5 is 1. 3rd ancestor of node 5 will be -1.
 *
 *
 *
 *
 * tutorial. On Geeks for geeks. In
 * Pause
 *
 * Unmute
 * Remaining Time-2:25
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * We have discussed a BFS-based solution for this problem in our previous article. If you observe that solution carefully, you will see that the basic approach was to first find the node and then backtrack to the kth parent. The same thing can be done using recursive DFS without using an extra array.
 *
 * The idea of using DFS is to first find the given node in the tree and then backtrack k times to reach the kth ancestor. Once we have reached the kth parent, we will simply print the node and return NULL.
 *
 * Below is the implementation of the above idea:
 */
public class KthAncestorOfNode {
}
