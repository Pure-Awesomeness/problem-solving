package com.practice.problems.adityaverma.binarysearch;

import lombok.extern.log4j.Log4j2;

import java.util.List;

import static com.practice.problems.adityaverma.binarysearch.FirstAndLastOccurrenceOfAnElement.*;

/**
 * Given a sorted array of n elements, possibly with duplicates,
 * find the number of occurrences of the target element.
 * <p>
 * Input: arr = [4, 4, 8, 8, 8, 15, 16, 23, 23, 42], target = 8
 * Output: 3
 * <p>
 * Input: arr = [3, 5, 5, 5, 5, 7, 8, 8], target = 6
 * Output: 0
 * <p>
 * Input: arr = [3, 5, 5, 5, 5, 7, 8, 8], target = 5
 * Output: 4
 **/

@Log4j2
public class CountOfAnElementInASortedArray {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 10, 10, 10, 18, 20);
        Integer search = 10;

        log.info("Input: {} | Count of element: {}", list, search);
        log.info("Output: Count of '{}' is {}", search, countOfAnElement(list, search));
    }

    private static Integer countOfAnElement(List<Integer> list, Integer search) {
        int first = firstOccurrence(list, search);
        int last = lastOccurrence(list, search);
        int count = last - first;
        return count > 0 ? count + 1 : 0;
    }
}
