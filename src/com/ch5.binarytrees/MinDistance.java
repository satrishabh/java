package com.ch5.binarytrees;

/**
 * Min distance between two given nodes of a Binary Tree
 * MediumAccuracy: 45.05%Submissions: 67967Points: 4
 * Given a binary tree and two node values your task is to find the minimum distance between them.
 *
 * Example 1:
 *
 * Input:
 *         1
 *       /  \
 *      2    3
 * a = 2, b = 3
 * Output: 2
 * Explanation: The tree formed is:
 *        1
 *      /   \
 *     2     3
 * We need the distance between 2 and 3.
 * Being at node 2, we need to take two
 * steps ahead in order to reach node 3.
 * The path followed will be:
 * 2 -> 1 -> 3. Hence, the result is 2.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function findDist() which takes the root node of the Tree and the two node values a and b as input parameters and returns the minimum distance between the nodes represented by the two given node values.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(Height of the Tree).
 *
 * Constraints:
 * 1 <= Number of nodes <= 104
 * 1 <= Data of a node <= 105
 */
public class MinDistance {
}
