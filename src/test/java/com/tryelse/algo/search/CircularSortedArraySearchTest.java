package com.tryelse.algo.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CircularSortedArraySearchTest {

    Search search = new CircularSortedArraySearch();

    @Test
    public void testFind() throws Exception {
        test(Arrays.asList(3, 4, 5, 6, 1, 2), 4, 1);
        test(Arrays.asList(4, 5, 1), 3, -1);
        test(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 1), 10, -1);
        test(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9), 1, 1);
        test(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9), 0, -1);
    }

    private void test(List<Integer> list, int element, int result) {
        assertEquals(result, search.find(element, list));
    }
}