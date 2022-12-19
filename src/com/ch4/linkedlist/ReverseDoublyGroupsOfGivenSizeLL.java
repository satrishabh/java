package com.ch4.linkedlist;

/**
 * Reverse a doubly linked list in groups of given size
 *
 * Difficulty Level : Medium
 * Last Updated : 03 Jul, 2022
 * Given a doubly linked list containing n nodes. The problem is to reverse every group of k nodes in the list.
 *
 * Examples:
 * Input: DLL:10<->8<->4<->2
 * k=2
 * Output: 8<->10<->2<->4
 *
 * Input: 1<->2<->3<->4<->5<->6<->7<->8
 * k=3
 *
 * Output: 3<->2<->1<->6<->5<->4<->8<->7
 *
 *
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * Prerequisite: Reverse a doubly linked list | Set-2.
 *
 * Complete Interview Preparation - GFG
 *
 * Approach: Create a recursive function say reverse(head, k). This function receives the head or the first node of each group of k nodes. It reverses those groups of k nodes by applying the approach discussed in Reverse a doubly linked list | Set-2. After reversing the group of k nodes the function checks whether next group of nodes exists in the list or not. If a group exists then it makes a recursive call to itself with the first node of the next group and makes the necessary adjustments with the next and previous links of that group. Finally, it returns the new head node of the reversed group.
 */
public class ReverseDoublyGroupsOfGivenSizeLL {
}
