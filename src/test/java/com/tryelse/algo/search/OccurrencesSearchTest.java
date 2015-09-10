package com.tryelse.algo.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class OccurrencesSearchTest {

    Occurrences occ = new OccurrencesSearch();

    @Test
    public void testFindOccurrences() throws Exception {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6);
        test(list, 1, 2);
        test(list, 2, 2);
        test(list, 3, 5);
        test(list, 4, 1);
        test(list, 5, 2);
        test(list, 6, 1);
    }

    private void test(List<Integer> list, Integer number, int occurrences) {
        assertEquals(occurrences, occ.findOccurrences(number, list));
    }
}