package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {

    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        List<Integer> squares = new ArrayList<>();
        for (Integer integer : sourceList) {
            squares.add(integer * integer);
        }
        return new TreeSet<>(squares).subSet(lowerBound, true, upperBound, true);
    }
}
