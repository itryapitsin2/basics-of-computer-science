package org.examples.types;

public interface List<T> {
    T[] getItems();

    T getItem(int i);

    int getCount();
}
