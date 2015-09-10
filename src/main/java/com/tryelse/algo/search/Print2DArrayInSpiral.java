package com.tryelse.algo.search;

import java.util.List;

public class Print2DArrayInSpiral {
    public <T> String printArray(List<List<T>> list2d) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        int b = list2d.size() - 1;
        int l = 0;
        int r = list2d.get(0).size() -1;
        int dir = 0;
        while (t <= b && l <= r) {
            if(dir == 0) {
                for (int i = l; i <= r; i++) {
                    sb.append(list2d.get(t).get(i)).append(" ");
                }
                t++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    sb.append(list2d.get(i).get(r)).append(" ");
                }
                r--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    sb.append(list2d.get(b).get(i)).append(" ");
                }
                b--;
                dir = 3;
            } else if (dir == 3) {
                for (int i = b; i >= t; i--) {
                    sb.append(list2d.get(i).get(l)).append(" ");
                }
                l++;
                dir = 0;
            }
        }
        return sb.toString().trim();
    }
}
