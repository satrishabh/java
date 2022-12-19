package com.ch4.linkedlist;

/**
 * Move last element to front of a given Linked List
 *
 * Difficulty Level : Basic
 * Last Updated : 24 Jun, 2022
 * Write a function that moves the last element to the front in a given Singly Linked List. For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
 *
 * Algorithm: Traverse the list till last node. Use two pointers: one to store the address of last node and other for address of second last node. After the end of loop do following operations.
 *
 *
 * Fullscreen
 * Make second last as last (secLast->next = NULL).
 * Set next of last as head (last->next = *head_ref).
 * Make last as head ( *head_ref = last)
 */
public class LastElementLL {
}
