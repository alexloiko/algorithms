package com.tryelse.algo.search;

import java.util.List;

public interface Search {
    <T extends Comparable> int find(T element, List<T> list);

    <T extends Comparable> int find(T element, List<T> list, boolean firstOccurrence);
}
