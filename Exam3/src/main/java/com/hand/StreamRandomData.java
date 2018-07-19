package com.hand;

public class StreamRandomData extends AbsRandomData {

    @Override
    public void sort() {
        data.values().stream().forEach(nums -> {
            for (int i = 1; i < nums.size() - 1; i++) {
                for (int j = 0; j < nums.size() - i; j++) {
                    if (nums.get(j) > nums.get(j + 1)) {
                        int swap = nums.get(j);
                        nums.set(j, nums.get(j + 1));
                        nums.set(j + 1, swap);
                    }
                }
            }
        });
    }
}
