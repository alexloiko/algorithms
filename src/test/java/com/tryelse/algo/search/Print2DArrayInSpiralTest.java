package com.tryelse.algo.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Print2DArrayInSpiralTest {

    private final Print2DArrayInSpiral print = new Print2DArrayInSpiral();

    @Test
    public void testPrintArray2() throws Exception {
        assertEquals("0 1 3 2", print.printArray(generateList(2)));
    }

    @Test
    public void testPrintArray3() throws Exception {
        assertEquals("0 1 2 5 8 7 6 3 4", print.printArray(generateList(3)));
    }

    @Test
    public void testPrintArray4() throws Exception {
        assertEquals("0 1 2 3 7 11 15 14 13 12 8 4 5 6 10 9", print.printArray(generateList(4)));
    }

    @Test
    public void testPrintArray5() throws Exception {
        assertEquals("0 1 2 3 4 9 14 19 24 23 22 21 20 15 10 5 6 7 8 13 18 17 16 11 12", print.printArray(generateList(5)));
    }

    private List<List<Integer>> generateList(int n) {
        List<List<Integer>> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> toAdd = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                toAdd.add(a++);
            }
            list.add(toAdd);
        }
        return list;
    }
}