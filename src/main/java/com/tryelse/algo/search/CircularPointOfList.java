package com.tryelse.algo.search;

import java.util.List;

/**
 * O(log(n))
 * Only for sorted list without duplicates
 */
public class CircularPointOfList {
    public <T extends Comparable<T>> int findRotationPoint(List<T> list) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int next = (mid + 1) % list.size();
            int prev = (mid - 1 + list.size()) % list.size();
            if (list.get(low).compareTo(list.get(high)) <= 0) {
                return low;
            } else if (list.get(mid).compareTo(list.get(prev)) <= 0 && list.get(mid).compareTo(list.get(next)) <= 0) {
                return mid;
            } else if (list.get(mid).compareTo(list.get(high)) <= 0) {
                high = mid - 1;
            } else if (list.get(mid).compareTo(list.get(low)) >= 0) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
