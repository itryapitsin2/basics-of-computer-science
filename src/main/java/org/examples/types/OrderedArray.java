package org.examples.types;

import org.examples.algorithms.sort.Sort;

public class OrderedArray<T extends Comparable<T>> extends Array<T> {

    private Sort<T> sort;

    public OrderedArray(Class<T> classType, int maxCount, Sort<T> sort) {
        super(classType, maxCount);
        this.sort = sort;
    }

    @Override
    public void insert(int i, T element) {
        super.insert(i, element);
        items = sort.sort(getItems(), count);
    }
}
