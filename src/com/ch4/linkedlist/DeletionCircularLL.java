package com.ch4.linkedlist;

/**
 * Deletion from a Circular Linked List
 *
 * Difficulty Level : Easy
 * Last Updated : 24 Jun, 2022
 * We have already discussed circular linked list and traversal in a circular linked list in the below articles:
 * Introduction to circular linked list
 * Traversal in a circular linked list
 * In this article, we will learn about deleting a node from a circular linked list. Consider the linked list as shown below:
 *
 * cll_inserted
 *
 * We will be given a node and our task is to delete that node from the circular linked list.
 *
 * Complete Interview Preparation - GFG
 *
 * Examples:
 *
 * Input : 2->5->7->8->10->(head node)
 *         data = 5
 * Output : 2->7->8->10->(head node)
 *
 * Input : 2->5->7->8->10->(head node)
 *          7
 * Output : 2->5->8->10->(head node)
 * Algorithm
 * Case 1: List is empty.
 *
 * If the list is empty we will simply return.
 * Case 2:List is not empty
 *
 * If the list is not empty then we define two pointers curr and prev and initialize the pointer curr with the head node.
 * Traverse the list using curr to find the node to be deleted and before moving to curr to the next node, every time set prev = curr.
 * If the node is found, check if it is the only node in the list. If yes, set head = NULL and free(curr).
 * If the list has more than one node, check if it is the first node of the list. Condition to check this( curr == head). If yes, then move prev until it reaches the last node. After prev reaches the last node, set head = head -> next and prev -> next = head. Delete curr.
 * If curr is not the first node, we check if it is the last node in the list. Condition to check this is (curr -> next == head).
 * If curr is the last node. Set prev -> next = head and delete the node curr by free(curr).
 * If the node to be deleted is neither the first node nor the last node, then set prev -> next = curr -> next and delete curr.
 */
public class DeletionCircularLL {
}
