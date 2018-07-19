package com.hand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbsRandomData implements IRandomData {

    protected Map<Integer, List<Integer>> data = new HashMap<>();

    @Override
    public Map<Integer, List<Integer>> getData() {
        return data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
