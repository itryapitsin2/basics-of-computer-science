package org.examples.algorithms.sort;

import org.examples.types.Comparable;

public class CombSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public T[] sort(T[] items, long count) {
        double factor = 1.247; // Reduce factor
        int step = (int) (count - 1);

        while (step >= 1) {
            for (int i = 0; i + step < count; ++i) {
                if (items[i].right(items[(int) (i + step)])) {
                    T tmp = items[(int) i + step];
                    items[(int) (i + step)] = items[(int) i];
                    items[(int) i] = tmp;
                }
            }
            step /= factor;
        }
        BubbleSort<T> sort = new BubbleSort<>();
        return sort.sort(items, count);
    }
}
