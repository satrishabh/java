package com.ch3.searchingsorting;

/**
 * Weighted Job Scheduling in O(n Log n) time
 *
 * Difficulty Level : Hard
 * Last Updated : 22 Feb, 2022
 * Given N jobs where every job is represented by following three elements of it.
 *
 * Start Time
 * Finish Time
 * Profit or Value Associated
 * Find the maximum profit subset of jobs such that no two jobs in the subset overlap.
 * Example:
 *
 * Input: Number of Jobs n = 4
 *        Job Details {Start Time, Finish Time, Profit}
 *        Job 1:  {1, 2, 50}
 *        Job 2:  {3, 5, 20}
 *        Job 3:  {6, 19, 100}
 *        Job 4:  {2, 100, 200}
 * Output: The maximum profit is 250.
 * We can get the maximum profit by scheduling jobs 1 and 4.
 * Note that there is longer schedules possible Jobs 1, 2 and 3
 * but the profit with this schedule is 20+50+100 which is less than 250.
 * We strongly recommend to refer below article as a prerequisite for this.
 * Weighted Job Scheduling
 * The above problem can be solved using following recursive solution.
 *
 *
 * 1) First sort jobs according to finish time.
 * 2) Now apply following recursive process.
 *    // Here arr[] is array of n jobs
 *    findMaximumProfit(arr[], n)
 *    {
 *      a) if (n == 1) return arr[0];
 *      b) Return the maximum of following two profits.
 *          (i) Maximum profit by excluding current job, i.e.,
 *              findMaximumProfit(arr, n-1)
 *          (ii) Maximum profit by including the current job
 *    }
 *
 * How to find the profit including current job?
 * The idea is to find the latest job before the current job (in
 * sorted array) that doesn't conflict with current job 'arr[n-1]'.
 * Once we find such a job, we recur for all jobs till that job and
 * add profit of current job to result.
 * In the above example, "job 1" is the latest non-conflicting
 * for "job 4" and "job 2" is the latest non-conflicting for "job 3".
 * We have discussed recursive and Dynamic Programming based approaches in the previous article. The implementations discussed in above post uses linear search to find the previous non-conflicting job. In this post, Binary Search based solution is discussed. The time complexity of Binary Search based solution is O(n Log n).
 * The algorithm is:
 *
 *
 * Sort the jobs by non-decreasing finish times.
 * For each i from 1 to n, determine the maximum value of the schedule from the subsequence of jobs[0..i]. Do this by comparing the inclusion of job[i] to the schedule to the exclusion of job[i] to the schedule, and then taking the max.
 * To find the profit with inclusion of job[i]. we need to find the latest job that doesn’t conflict with job[i]. The idea is to use Binary Search to find the latest non-conflicting job.
 */
public class WeightedJobScheduling {
}
