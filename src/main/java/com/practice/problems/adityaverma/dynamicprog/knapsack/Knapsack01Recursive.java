package com.practice.problems.adityaverma.dynamicprog.knapsack;

import lombok.extern.log4j.Log4j2;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Given weights and values of n items,
 * put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
 * <p>
 * In other words, given two integer arrays val[0..n-1] and wt[0..n-1]
 * which represent values and weights associated with n items respectively.
 * <p>
 * Also given an integer W which represents knapsack capacity,
 * find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
 * You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
 **/

@Log4j2
public class Knapsack01Recursive {

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 5};
        int[] values = {1, 6, 10, 16};
        int capacity = 7;
        log.info("Input:: Weights: {}\t# Values: {}\t# Knapsack Wt: {}", weights, values, capacity);
        int total = solveKnapsack(weights, values, capacity);
        log.info("Output:: Total knapsack: {}", total);
        assertTrue(total == 22);

        capacity = 6;
        log.info("Input:: Weights: {}\t# Values: {}\t# Knapsack Wt: {}", weights, values, capacity);
        total = solveKnapsack(weights, values, capacity);
        log.info("Output:: Total knapsack: {}", total);
        assertTrue(total == 17);
    }

    public static int solveKnapsack(int[] weights, int[] values, int capacity) {
        return knapsackRecursive(weights, values, capacity, weights.length - 1);
    }

    public static int knapsackRecursive(int[] weights, int[] values, int capacity, int currentIndex) {
        if (currentIndex == -1 || capacity == 0) {    // IF >> currentIndex out of bound OR knapsack capacity ZERO
            return 0;
        }

        int currentValue = values[currentIndex];
        int currentWeight = weights[currentIndex];

        if (currentWeight > capacity) {     // IF >> current weight goes beyond knapsack capacity it EXCLUDED
            int exclude = knapsackRecursive(weights, values, capacity, currentIndex - 1);
            return exclude;
        } else {                            // ELSE >> current weight is within knapsack capacity it is INCLUDED
            int include = currentValue + knapsackRecursive(weights, values, capacity - currentWeight, currentIndex - 1);
            int exclude = knapsackRecursive(weights, values, capacity, currentIndex - 1);
            return Math.max(exclude, include);
        }
    }
}
