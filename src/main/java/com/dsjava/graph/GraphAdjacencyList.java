package com.dsjava.graph;

import java.util.*;

public class GraphAdjacencyList {
    private final int n;
    private final List<List<Integer>> adj;
    public GraphAdjacencyList(int n){ this.n=n; adj=new ArrayList<>(); for(int i=0;i<n;i++) adj.add(new ArrayList<>()); }
    public void addEdge(int u,int v){ adj.get(u).add(v); adj.get(v).add(u); }
    public List<Integer> neighbors(int u){ return adj.get(u); }
}
