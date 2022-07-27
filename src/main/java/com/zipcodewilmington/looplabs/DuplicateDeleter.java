package com.zipcodewilmington.looplabs;

import java.util.HashMap;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;
    HashMap<T, Integer> hashMap;

    public DuplicateDeleter(T[] intArray) {

        this.array = intArray;
        hashMap = new HashMap<>();
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);

    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    public void getNumberOfOccurrence() {
        for (T i : array) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
                continue;
            } else if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            }
        }
    }
}
