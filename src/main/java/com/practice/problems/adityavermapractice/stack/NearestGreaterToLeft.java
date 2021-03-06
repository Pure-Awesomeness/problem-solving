package com.practice.problems.adityavermapractice.stack;

import java.util.List;

public abstract class NearestGreaterToLeft extends NearestGreaterSmaller {

    public abstract List<Integer> nearestGreaterToLeft(List<Integer> inputList, int pseudoIndex);

    public void execute() {
        List<Integer> input = List.of(6, 8, 7, 9);
        List<Integer> actual = nearestGreaterToLeft(input, -1);
        List<Integer> expected = List.of(-1, -1, 1, -1);
        test(input, actual, " 'i' moving from left2Right >>>>>>", expected);
    }
}
