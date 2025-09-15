package com.dsjava.arrays;

import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] data;
    private int size;

    public DynamicArray() { this(10); }
    public DynamicArray(int cap) { data = new Object[cap]; size = 0; }

    public void add(T val) {
        ensure(size + 1);
        data[size++] = val;
    }

    @SuppressWarnings("unchecked")
    public T get(int idx) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
        return (T) data[idx];
    }

    public int size() { return size; }

    public T removeLast() {
        if (size == 0) return null;
        @SuppressWarnings("unchecked")
        T val = (T) data[--size];
        data[size] = null;
        return val;
    }

    private void ensure(int min) {
        if (min > data.length) {
            int newCap = data.length + (data.length >> 1);
            if (newCap < min) newCap = min;
            data = Arrays.copyOf(data, newCap);
        }
    }
}
