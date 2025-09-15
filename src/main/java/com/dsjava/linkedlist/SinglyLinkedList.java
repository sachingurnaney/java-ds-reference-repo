package com.dsjava.linkedlist;

public class SinglyLinkedList<T> {
    static class Node<T> { T val; Node<T> next; Node(T v){val=v;} }
    private Node<T> head;
    private int size;

    public void addFirst(T v){ Node<T> n = new Node<>(v); n.next = head; head = n; size++; }
    public void addLast(T v){ Node<T> n = new Node<>(v); if(head==null){ head=n; size++; return;} Node<T> cur=head; while(cur.next!=null) cur=cur.next; cur.next=n; size++; }
    public T removeFirst(){ if(head==null) return null; T v=head.val; head=head.next; size--; return v; }
    public int size(){ return size; }

    public void reverse(){
        Node<T> prev = null, cur = head;
        while(cur!=null){
            Node<T> next = cur.next;
            cur.next = prev;
            prev = cur; cur = next;
        }
        head = prev;
    }

    // utility for tests
    public Object[] toArray(){
        Object[] a = new Object[size];
        int i=0; for(Node<T> cur=head; cur!=null; cur=cur.next) a[i++]=cur.val;
        return a;
    }
}
