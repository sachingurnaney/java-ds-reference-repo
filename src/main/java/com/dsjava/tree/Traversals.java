package com.dsjava.tree;

import java.util.*;

public class Traversals {
    public static List<Integer> inorder(BinarySearchTree.Node root){ List<Integer> out=new ArrayList<>(); inorderHelper(root, out); return out; }
    private static void inorderHelper(BinarySearchTree.Node n, List<Integer> out){ if(n==null) return; inorderHelper(n.left,out); out.add(n.val); inorderHelper(n.right,out); }
}
