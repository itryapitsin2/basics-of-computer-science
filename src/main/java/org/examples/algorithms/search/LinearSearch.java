package org.examples.algorithms.search;

import org.examples.types.List;

public class LinearSearch<T> implements Search<List<T>, T> {
    public int has(List<T> list, T element) {
        for (int i = 0; i < list.getCount(); i++) {
            if (list.getItems()[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
