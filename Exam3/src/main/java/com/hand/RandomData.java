package com.hand;

import java.util.*;

public class RandomData extends AbsRandomData {

    @Override
    public void sort() {
        for (List<Integer> nums : data.values()) {
            int min, minIndex, i, j, swap, numj;
            for (i = 0; i < nums.size() - 1; i++) {
                min = nums.get(i);
                minIndex = i;
                for (j = i + 1; j < nums.size(); j++) {
                    numj = nums.get(j);
                    if (numj < min) {
                        min = numj;
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    swap = nums.get(i);
                    nums.set(i, min);
                    nums.set(minIndex, swap);
                }
            }
        }
    }
}
