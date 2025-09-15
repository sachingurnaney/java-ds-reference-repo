package com.dsjava.linkedlist;

public class DoublyLinkedList<T> {
    static class Node<T>{ T val; Node<T> prev, next; Node(T v){val=v;} }
    private Node<T> head, tail; private int size;

    public void addLast(T v){
        Node<T> n = new Node<>(v);
        if(head==null){ head=tail=n; size++; return; }
        tail.next = n; n.prev = tail; tail = n; size++;
    }

    public T removeLast(){
        if(tail==null) return null;
        T v = tail.val;
        tail = tail.prev;
        if(tail==null) head=null; else tail.next=null;
        size--; return v;
    }

    public int size(){ return size; }
}
