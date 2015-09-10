package com.tryelse.algo.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CircularPointOfListTest {

    CircularPointOfList circularPointOfList = new CircularPointOfList();

    @Test
    public void testFindRotationPoint() throws Exception {
        test(Arrays.asList(3, 4, 5, 6, 1, 2), 4);
        test(Arrays.asList(3, 4, 5, 1), 3);
        test(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 1), 7);
        test(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9), 0);
    }

    private void test(List<Integer> list, int start) {
        assertEquals(start, circularPointOfList.findRotationPoint(list));
    }
}