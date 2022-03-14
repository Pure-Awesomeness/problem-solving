package com.practice.problems.slidingwindow.variablesize;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class LargestSubArrayOfSumK {

    public static void main(String[] args) {
        List<Integer> input = List.of(4, 1, 1, 1, 2, 3, 5);
        int sum = 5;
        log.info("Input:{} , Sum:{}", input, sum);
        log.info("Output:{}", slidingWindow(input, sum));
    }

    private static Integer slidingWindow(List<Integer> input, int sum) {
        int maxWindow = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int currentSum = 0;

        while (windowEnd < input.size()) {
            int currentElement = input.get(windowEnd);
            int currentWindow = windowEnd - windowStart + 1;

            currentSum += currentElement;

            if (currentSum < sum) windowEnd++;              /* STEP 2:: Window sum not reached, increment endWindow */
            else if (currentSum == sum) {                   /* STEP 3:: Window sum REACHED */
                maxWindow = Math.max(currentWindow, maxWindow);
                windowEnd++;
            } else if (currentSum > sum) {
                while (currentSum > sum) {
                    currentSum -= input.get(windowStart);
                    windowStart = windowStart + 1;
                }
                windowEnd++;
            }
        }

        return maxWindow;
    }
}