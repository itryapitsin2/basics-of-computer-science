package org.examples.algorithms.sort;

import org.examples.types.Comparable;

public class BubbleSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public T[] sort(T[] items, long count) {
        T temp;
        for (int i = 0; i < count; i++) {
            for (int j = 1; j < (count - i); j++) {
                if (items[j - 1].right(items[j])) {
                    temp = items[j - 1];
                    items[j - 1] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }
}
