package com.tryelse.algo.search;

import java.util.List;

/**
 * Sorted list is used
 * O(log(n))
 */
public class BinarySearch implements Search {
    public <T extends Comparable> int find(T element, List<T> list) {
        return find(element, list, true);
    }

    public <T extends Comparable> int find(T element, List<T> list, boolean firstOccurrence) {
        int left = 0;
        int right = list.size() - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid).compareTo(element) == 0) {
                result = mid;
                if (firstOccurrence) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (list.get(mid).compareTo(element) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
