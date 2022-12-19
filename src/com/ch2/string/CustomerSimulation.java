package com.ch2.string;

/**
 * Function to find Number of customers who could not get a computer
 *
 * Difficulty Level : Medium
 * Last Updated : 27 Jun, 2022
 * Write a function “runCustomerSimulation” that takes following two inputs
 *
 * An integer ‘n’: total number of computers in a cafe and a string:
 * A sequence of uppercase letters ‘seq’: Letters in the sequence occur in pairs. The first occurrence indicates the arrival of a customer; the second indicates the departure of that same customer.
 * A customer will be serviced if there is an unoccupied computer. No letter will occur more than two times.
 * Customers who leave without using a computer always depart before customers who are currently using the computers. There are at most 20 computers per cafe.
 *
 * For each set of input the function should output a number telling how many customers, if any walked away without using a computer. Return 0 if all the customers were able to use a computer.
 * runCustomerSimulation (2, “ABBAJJKZKZ”) should return 0
 * runCustomerSimulation (3, “GACCBDDBAGEE”) should return 1 as ‘D’ was not able to get any computer
 * runCustomerSimulation (3, “GACCBGDDBAEE”) should return 0
 * runCustomerSimulation (1, “ABCBCA”) should return 2 as ‘B’ and ‘C’ were not able to get any computer.
 * runCustomerSimulation(1, “ABCBCADEED”) should return 3 as ‘B’, ‘C’ and ‘E’ were not able to get any computer.
 * Source: Fiberlink (maas360) Interview
 *
 * We strongly recommend to minimize your browser and try this yourself first.
 *
 * Below are simple steps to find number of customers who could not get any computer.
 *
 * Initialize result as 0.
 * Traverse the given sequence. While traversing, keep track of occupied computers (this can be done by keeping track of characters which have appeared only once and a computer was available when they appeared). At any point, if count of occupied computers is equal to ‘n’, and there is a new customer, increment result by 1.
 * The important thing is to keep track of existing customers in cafe in a way that can indicate whether the customer has got a computer or not. Note that in sequence “ABCBCADEED”, customer ‘B’ did not get a seat, but still in cafe as a new customer ‘C’ is next in sequence.
 *
 * Below are implementations of above idea.
 */
public class CustomerSimulation {
}
