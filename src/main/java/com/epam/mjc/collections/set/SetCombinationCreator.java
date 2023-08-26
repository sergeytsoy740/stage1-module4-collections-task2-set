package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
//    public static void main(String[] args) {
//
//        Set<String> firstSet =
//                new LinkedHashSet<>(List.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet"));
//
//        Set<String> secondSet =
//                new LinkedHashSet<>(List.of("Queue", "SortedSet", "NavigableSet", "List", "Set", "Iterator", "Comparator"));
//
//        Set<String> thirdSet =
//                new LinkedHashSet<>(List.of("Java", "Iterable", "Comparator"));
//
//        createSetCombination(firstSet, secondSet, thirdSet); // "SortedSet", "NavigableSet", "Set"
//    }

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> first = new LinkedHashSet<>(firstSet);
        Set<String> second = new LinkedHashSet<>(secondSet);
        Set<String> third = new LinkedHashSet<>(thirdSet);

        first.retainAll(third);
        second.retainAll(third);

        Set<String> commonOfFirstAndThird = new LinkedHashSet<>(first);
        firstSet.removeAll(commonOfFirstAndThird);
        thirdSet.removeAll(commonOfFirstAndThird);

        Set<String> commonOfSecondAndThird = new LinkedHashSet<>(second);
        secondSet.removeAll(commonOfSecondAndThird);
        thirdSet.removeAll(commonOfSecondAndThird);


        secondSet.retainAll(firstSet);
        secondSet.addAll(thirdSet);

//        System.out.println(secondSet);

        return secondSet;
    }
}
