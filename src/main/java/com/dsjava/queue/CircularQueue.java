package com.dsjava.queue;

public class CircularQueue<T> {
    private Object[] arr; private int head=0, tail=0, size=0;
    public CircularQueue(int cap){ arr = new Object[Math.max(2,cap)]; }
    public boolean offer(T v){ if(size==arr.length) return false; arr[tail]=v; tail=(tail+1)%arr.length; size++; return true; }
    @SuppressWarnings("unchecked") public T poll(){ if(size==0) return null; T v=(T)arr[head]; arr[head]=null; head=(head+1)%arr.length; size--; return v; }
}
