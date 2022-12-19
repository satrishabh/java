package com.ch4.linkedlist;

/**
 * Reverse a linked list
 *
 * Difficulty Level : Medium
 * Given pointer to the head node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing the links between nodes.
 *
 * Examples:
 *
 *
 * Pause
 *
 * Unmute
 * Remaining Time-9:34
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * Click here for the Complete Course!
 * Input: Head of following linked list
 * 1->2->3->4->NULL
 * Output: Linked list should be changed to,
 * 4->3->2->1->NULL
 *
 * Input: Head of following linked list
 * 1->2->3->4->5->NULL
 * Output: Linked list should be changed to,
 * 5->4->3->2->1->NULL
 *
 * Input: NULL
 * Output: NULL
 *
 * Input: 1->NULL
 * Output: 1->NULL
 *
 *
 * Recommended Practice
 * Reverse a linked list
 * Try It!
 * Iterative Method
 *
 * Initialize three pointers prev as NULL, curr as head and next as NULL.
 * Iterate through the linked list. In loop, do following.
 * // Before changing next of current,
 * // store next node
 * next = curr->next
 * // Now change next of current
 * // This is where actual reversing happens
 * curr->next = prev
 * // Move prev and curr one step forward
 * prev = curr
 * curr = next
 *
 *
 * Below is the implementation of the above approach:
 */
public class ReverseLinkedList {
}
