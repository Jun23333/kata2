package prac2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram {
    private final int[] values;
    private final Map<Integer, Integer> counts = new HashMap<>();

    public Histogram(int... values) {
        this.values = values;
        for (int value : values) {
            counts.put(value, counts.getOrDefault(value, 0)+1);
        }
    }

    public Set<Integer> getValue() {
        return counts.keySet();
    }


    public int getCount(int key) {
        return counts.get(key);
    }

}
