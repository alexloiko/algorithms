package com.tryelse.algo.search;

import java.util.List;

/**
 * O(log(n))
 * Only for circularly sorted non-duplicated array
 */
public class CircularSortedArraySearch implements Search {
    @Override
    public <T extends Comparable<T>> int find(T element, List<T> list) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid).equals(element)) {
                return 1;
            } else if (list.get(low).compareTo(list.get(mid)) < 0) {
                if(list.get(low).compareTo(element) <= 0 && list.get(mid).compareTo(element) > 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(list.get(mid).compareTo(element) < 0 && list.get(high).compareTo(element) <= 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    @Override
    public <T extends Comparable<T>> int find(T element, List<T> list, boolean firstOccurrence) {
        return -1;
    }
}
