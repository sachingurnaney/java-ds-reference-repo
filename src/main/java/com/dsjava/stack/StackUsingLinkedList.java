package com.dsjava.stack;

import com.dsjava.linkedlist.SinglyLinkedList;

public class StackUsingLinkedList<T> {
    private SinglyLinkedList<T> list = new SinglyLinkedList<>();
    public void push(T v){ list.addFirst(v); }
    public T pop(){ return list.removeFirst(); }
    public boolean isEmpty(){ return list.size()==0; }
}
