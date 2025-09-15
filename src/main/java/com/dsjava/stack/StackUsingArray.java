package com.dsjava.stack;

public class StackUsingArray<T> {
    private Object[] arr; private int top = -1;
    public StackUsingArray(int cap){ arr = new Object[Math.max(2,cap)]; }
    public void push(T v){ if(top+1==arr.length) arr = java.util.Arrays.copyOf(arr, arr.length*2); arr[++top]=v; }
    @SuppressWarnings("unchecked") public T pop(){ if(top==-1) return null; T v=(T)arr[top]; arr[top--]=null; return v; }
    public boolean isEmpty(){ return top==-1; }
}
