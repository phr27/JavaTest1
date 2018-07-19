package com.hand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDataFactory {

    private static ThreadLocal<Random> randomThreadLocal = ThreadLocal.withInitial(() -> new Random());

    private void prepare(IRandomData randomData) {
        int r1;
        List<Integer> nums;
        for (int i = 0; i < 50; i++) {
            final int r0 = randomThreadLocal.get().nextInt(100);
            r1 = r0 / 10;
            if ((nums = randomData.getData().get(r1)) == null) {
                randomData.getData().put(r1, new ArrayList<Integer>() {{
                    add(r0);
                }});
            } else {
                nums.add(r0);
            }
        }
    }

    public IRandomData createRandomData() {
        IRandomData randomData = new RandomData();
        prepare(randomData);

        return randomData;
    }

    public IRandomData createStreamRandomData() {
        IRandomData randomData = new StreamRandomData();
        prepare(randomData);

        return randomData;
    }
}
