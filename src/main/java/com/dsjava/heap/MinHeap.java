package com.dsjava.heap;

import java.util.*;

public class MinHeap {
    private final PriorityQueue<Integer> pq = new PriorityQueue<>();
    public void add(int v){ pq.offer(v); }
    public int poll(){ return pq.poll(); }
    public int peek(){ return pq.peek(); }
    public int size(){ return pq.size(); }
}
