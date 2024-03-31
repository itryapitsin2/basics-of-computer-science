package org.examples.algorithms.sort;

import org.examples.types.Comparable;

public interface Sort<T extends Comparable<T>> {
    T[] sort(T[] items, long count);
}
