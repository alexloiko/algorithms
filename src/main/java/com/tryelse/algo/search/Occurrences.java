package com.tryelse.algo.search;

import java.util.List;

public interface Occurrences {
    <T extends Comparable> int findOccurrences(T element, List<T> list);
}
