package com.ch3.searchingsorting;

/**
 * Optimum location of point to minimize total distance
 *
 * Difficulty Level : Hard
 * Last Updated : 25 Jun, 2022
 * Given a set of points as and a line as ax+by+c = 0. We need to find a point on given line for which sum of distances from given set of points is minimum.
 *
 * Example:
 *
 *
 *
 * In above figure optimum location of point of x - y - 3 = 0 line
 * is (2, -1), whose total distance with other points is 20.77,
 * which is minimum obtainable total distance.
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * If we take one point on given line at infinite distance then total distance cost will be infinite, now when we move this point on line towards given points the total distance cost starts decreasing and after some time, it again starts increasing which reached to infinite on the other infinite end of line so distance cost curve looks like a U-curve and we have to find the bottom value of this U-curve.
 *
 * As U-curve is not monotonically increasing or decreasing we can’t use binary search for finding bottom most point, here we will use ternary search for finding bottom most point, ternary search skips one third of search space at each iteration, you can read more about ternary search here.
 *
 * So solution proceeds as follows, we start with low and high initialized as some smallest and largest values respectively, then we start iteration, in each iteration we calculate two mids, mid1 and mid2, which represent 1/3rd and 2/3rd position in search space, we calculate total distance of all points with mid1 and mid2 and update low or high by comparing these distance cost, this iteration continues until low and high become approximately equal.
 */
public class OptimumLocation {
}
