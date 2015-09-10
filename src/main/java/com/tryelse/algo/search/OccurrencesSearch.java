package com.tryelse.algo.search;

import java.util.List;

/**
 * Sorted list is used
 * O(log(n))
 */
public class OccurrencesSearch implements Occurrences {
    public <T extends Comparable<T>> int findOccurrences(T element, List<T> list) {
        Search search = new BinarySearch();
        int first = search.find(element, list, true);
        int last = search.find(element, list, false);
        return last - first + 1;
    }
}
