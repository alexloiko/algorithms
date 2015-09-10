package com.tryelse.algo.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    Search binarySearch = new BinarySearch();

    @Test
    public void testFind() throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        test(1, list,  0, true);
        test(0, list, -1, true);
        test(2, list,  1, true);
        test(2, list,  2, false);
        test(3, list,  3, true);
        test(3, list,  5, false);
        test(4, list,  6, true);
        test(5, list,  -1, true);
    }

    private void test(int toFind, List<Integer> list, int position, boolean firstOccurrence) {
        assertEquals(position, binarySearch.find(toFind, list, firstOccurrence));
    }
}