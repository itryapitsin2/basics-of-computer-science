package org.examples.algorithms.sort;

import org.examples.types.Comparable;

public class MixSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public T[] sort(T[] items, long count) {
        int left = 0;
        long right = count - 1;
        while (left <= right) {
            for (long i = right; i > left; --i) {
                if (items[(int) (i - 1)].right(items[(int) i])) {
                    T tmp = items[(int) (i - 1)];
                    items[(int) (i - 1)] = items[(int) i];
                    items[(int) i] = tmp;
                }
            }
            ++left;
            for (long i = left; i < right; ++i) {
                if (items[(int) i].right(items[(int) (i + 1)])) {
                    T tmp = items[(int) i + 1];
                    items[(int) (i + 1)] = items[(int) i];
                    items[(int) i] = tmp;
                }
            }
            --right;
        }
        return items;
    }
}
