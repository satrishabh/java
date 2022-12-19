package com.ch4.linkedlist;

/**
 * Merge K sorted linked lists
 * MediumAccuracy: 41.42%Submissions: 53865Points: 4
 * Lamp
 * This problem is part of GFG SDE Sheet. Click here to view more.
 *
 * Given K sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list.
 *
 * Example 1:
 *
 * Input:
 * K = 4
 * value = {{1,2,3},{4 5},{5 6},{7,8}}
 * Output: 1 2 3 4 5 5 6 7 8
 * Explanation:
 * The test case has 4 sorted linked
 * list of size 3, 2, 2, 2
 * 1st    list     1 -> 2-> 3
 * 2nd   list      4->5
 * 3rd    list      5->6
 * 4th    list      7->8
 * The merged list will be
 * 1->2->3->4->5->5->6->7->8.
 * Example 2:
 *
 * Input:
 * K = 3
 * value = {{1,3},{4,5,6},{8}}
 * Output: 1 3 4 5 6 8
 * Explanation:
 * The test case has 3 sorted linked
 * list of size 2, 3, 1.
 * 1st list 1 -> 3
 * 2nd list 4 -> 5 -> 6
 * 3rd list 8
 * The merged list will be
 * 1->3->4->5->6->8.
 * Your Task:
 * The task is to complete the function mergeKList() which merges the K given lists into a sorted one. The printing is done automatically by the driver code.
 *
 * Expected Time Complexity: O(nk Logk)
 * Expected Auxiliary Space: O(k)
 * Note: n is the maximum size of all the k link list
 *
 * Constraints
 * 1 <= K <= 103
 */
public class MergeKSortedLL {
}
