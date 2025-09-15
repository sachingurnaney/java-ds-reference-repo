package com.dsjava.tree;

public class BinarySearchTree {
    static class Node{ int val; Node left, right; Node(int v){val=v;} }
    private Node root;
    public void insert(int v){ root = insert(root, v); }
    private Node insert(Node cur, int v){
        if(cur==null) return new Node(v);
        if(v < cur.val) cur.left = insert(cur.left, v);
        else if(v > cur.val) cur.right = insert(cur.right, v);
        return cur;
    }
    public boolean search(int v){ Node cur = root; while(cur!=null){ if(cur.val==v) return true; cur = v < cur.val ? cur.left : cur.right; } return false; }
}
