package com.tryelse.algo.search;

import java.util.List;

public interface Occurrences {
    <T extends Comparable<T>> int findOccurrences(T element, List<T> list);
}
