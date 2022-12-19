package com.ch1.matrix;

/**
 * Rotate a matrix by 90 degree in clockwise direction without using any extra space
 *
 * Difficulty Level : Medium
 * Last Updated : 11 Jul, 2022
 * Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.
 *
 * Examples:
 *
 * Input:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Output:
 * 7 4 1
 * 8 5 2
 * 9 6 3
 *
 * Input:
 * 1 2
 * 3 4
 * Output:
 * 3 1
 * 4 2
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * Method 1
 *
 * Approach: The approach is similar to Inplace rotate square matrix by 90 degrees | Set 1. The only thing that is different is to print the elements of the cycle in a clockwise direction i.e. An N x N matrix will have floor(N/2) square cycles.
 * For example, a 3 X 3 matrix will have 1 cycle. The cycle is formed by its 1st row, last column, last row, and 1st column.
 * For each square cycle, we swap the elements involved with the corresponding cell in the matrix in the clockwise direction. We just need a temporary variable for this.
 *
 * Explanation:
 *
 * Let size of row and column be 3.
 * During first iteration –
 * a[i][j] = Element at first index (leftmost corner top)= 1.
 * a[j][n-1-i]= Rightmost corner top Element = 3.
 * a[n-1-i][n-1-j] = Rightmost corner bottom element = 9.
 * a[n-1-j][i] = Leftmost corner bottom element = 7.
 * Move these elements in the clockwise direction.
 * During second iteration –
 * a[i][j] = 2.
 * a[j][n-1-i] = 6.
 * a[n-1-i][n-1-j] = 8.
 * a[n-1-j][i] = 4.
 * Similarly, move these elements in the clockwise direction.
 */
public class RotateTwoDMatrix {
}
