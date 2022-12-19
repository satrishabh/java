package com.ch1.array;

/**
 * Maximum profit by buying and selling a share at most twice
 *
 * Difficulty Level : Hard
 * Last Updated : 14 Mar, 2022
 * In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction can only start after the first one is complete (Buy->sell->Buy->sell). Given stock prices throughout the day, find out the maximum profit that a share trader could have made.
 *
 * Examples:
 *
 * Input:   price[] = {10, 22, 5, 75, 65, 80}
 * Output:  87
 * Trader earns 87 as sum of 12, 75
 * Buy at 10, sell at 22,
 * Buy at 5 and sell at 80
 * Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
 * Output:  100
 * Trader earns 100 as sum of 28 and 72
 * Buy at price 2, sell at 30, buy at 8 and sell at 80
 * Input:   price[] = {100, 30, 15, 10, 8, 25, 80};
 * Output:  72
 * Buy at price 8 and sell at 80.
 * Input:   price[] = {90, 80, 70, 60, 50}
 * Output:  0
 * Not possible to earn.
 * Recommended Practice
 * Buy and Sell a Share at most twice
 * Try It!
 * A Simple Solution is to consider every index ‘i’ and do the following
 *
 * Max profit with at most two transactions =
 * MAX {max profit with one transaction and subarray price[0..i] +
 * max profit with one transaction and subarray price[i+1..n-1] }
 * i varies from 0 to n-1.
 *
 * Maximum possible using one transaction can be calculated using the following O(n) algorithm
 * The maximum difference between two elements such that the larger element appears after the smaller number
 * The time complexity of the above simple solution is O(n2).
 *
 * We can do this O(n) using the following Efficient Solution. The idea is to store the maximum possible profit of every subarray and solve the problem in the following two phases.
 *
 * 1) Create a table profit[0..n-1] and initialize all values in it 0.
 * 2) Traverse price[] from right to left and update profit[i] such that profit[i] stores maximum profit achievable from one transaction in subarray price[i..n-1]
 * 3) Traverse price[] from left to right and update profit[i] such that profit[i] stores maximum profit such that profit[i] contains maximum achievable profit from two transactions in subarray price[0..i].
 * 4) Return profit[n-1]
 *
 * To do step 2, we need to keep track of the maximum price from right to left side, and to do step 3, we need to keep track of the minimum price from left to right. Why we traverse in reverse directions? The idea is to save space, in the third step, we use the same array for both purposes, maximum with 1 transaction and maximum with 2 transactions. After iteration i, the array profit[0..i] contains the maximum profit with 2 transactions, and profit[i+1..n-1] contains profit with two transactions.
 *
 * Below are the implementations of the above idea.
 */
public class MaximumProfitBuyingSellingShare {
}
