package com.epam.mjc.collections.set;

import java.util.*;

public class HashSetCreator {

    List<Integer> getResultsListOfOdd(int n) {
        List<Integer> resultsOfMultiplication = new ArrayList<>();
        resultsOfMultiplication.add(n);
        resultsOfMultiplication.add(2 * n);
        return resultsOfMultiplication;
    }

    List<Integer> getResultsListOfEven(int n) {
        List<Integer> resultsOfDivision = new ArrayList<>();
        int result = n;
        do {
            resultsOfDivision.add(result);
            result = result / 2;
            if (result % 2 != 0) {
                resultsOfDivision.add(result);
            }
        } while (result % 2 == 0);
        return resultsOfDivision;
    }

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hs = new LinkedHashSet<>();
        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                hs.addAll(getResultsListOfEven(num));
            } else {
                hs.addAll(getResultsListOfOdd(num));
            }
        }
        return hs;
    }
}
