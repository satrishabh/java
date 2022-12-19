package com.ch4.linkedlist;

/**
 * Find pairs with given sum in doubly linked list
 *
 * Difficulty Level : Easy
 * Last Updated : 06 Jul, 2022
 * Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value x, without using any extra space?
 *
 * Example:
 *
 * Input : head : 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
 *         x = 7
 * Output: (6, 1), (5,2)
 * The expected time complexity is O(n) and auxiliary space is O(1).
 *
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * A simple approach for this problem is to one by one pick each node and find a second element whose sum is equal to x in the remaining list by traversing in the forward direction. The time complexity for this problem will be O(n^2), n is the total number of nodes in the doubly linked list.
 *
 *
 * Complete Interview Preparation - GFG
 *
 * An efficient solution for this problem is the same as this article. Here is the algorithm :
 *
 * Initialize two pointer variables to find the candidate elements in the sorted doubly linked list. Initialize first with the start of the doubly linked list i.e; first=head and initialize second with the last node of the doubly linked list i.e; second=last_node.
 * We initialize first and second pointers as first and last nodes. Here we don’t have random access, so to find the second pointer, we traverse the list to initialize the second.
 * If current sum of first and second is less than x, then we move first in forward direction. If current sum of first and second element is greater than x, then we move second in backward direction.
 * Loop termination conditions are also different from arrays. The loop terminates when two pointers cross each other (second->next = first), or they become the same (first == second).
 * The case when no pairs are present will be handled by the condition “first==second”
 */
public class SumDoublyLL {
}
