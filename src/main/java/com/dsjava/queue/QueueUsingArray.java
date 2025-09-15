package com.dsjava.queue;

public class QueueUsingArray<T> {
    private Object[] arr; private int head=0, tail=0, size=0;
    public QueueUsingArray(int cap){ arr = new Object[Math.max(2,cap)]; }
    public void offer(T v){ if(size==arr.length) grow(); arr[tail]=v; tail=(tail+1)%arr.length; size++; }
    @SuppressWarnings("unchecked") public T poll(){ if(size==0) return null; T v=(T)arr[head]; arr[head]=null; head=(head+1)%arr.length; size--; return v; }
    public int size(){ return size; }
    private void grow(){ Object[] n = new Object[arr.length*2]; for(int i=0;i<size;i++) n[i]=arr[(head+i)%arr.length]; arr=n; head=0; tail=size; }
}
