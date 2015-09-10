package com.tryelse.algo.search;

import java.util.List;

public class CircularSortedArraySearch implements Search {
    @Override
    public <T extends Comparable> int find(T element, List<T> list) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int next = (mid + 1) % list.size();
            int prev = (mid - 1 + list.size()) % list.size();
            if (list.get(mid).compareTo(element) == 0) {
                return mid;
//            } else if (list.get(mid).compareTo(list.get(prev)) <= 0 && list.get(mid).compareTo(list.get(next)) <= 0) {
//                return mid;
            } else if (list.get(mid).compareTo(list.get(high)) <= 0) {
                if(list.get(mid).compareTo(element) < 0 && list.get(high).compareTo(element) <= 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (list.get(mid).compareTo(list.get(low)) >= 0) {
                if(list.get(mid).compareTo(element) > 0 && list.get(high).compareTo(element) >= 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    @Override
    public <T extends Comparable> int find(T element, List<T> list, boolean firstOccurrence) {
        return -1;
    }
}
