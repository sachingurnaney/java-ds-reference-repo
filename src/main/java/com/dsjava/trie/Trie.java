package com.dsjava.trie;

public class Trie {
    private static class Node { Node[] next = new Node[26]; boolean end; }
    private final Node root = new Node();
    public void insert(String s){ Node cur = root; for(char c: s.toCharArray()){ int i=c-'a'; if(cur.next[i]==null) cur.next[i]=new Node(); cur=cur.next[i]; } cur.end=true; }
    public boolean search(String s){ Node cur=root; for(char c: s.toCharArray()){ cur=cur.next[c-'a']; if(cur==null) return false; } return cur.end; }
    public boolean startsWith(String p){ Node cur=root; for(char c:p.toCharArray()){ cur=cur.next[c-'a']; if(cur==null) return false; } return true; }
}
