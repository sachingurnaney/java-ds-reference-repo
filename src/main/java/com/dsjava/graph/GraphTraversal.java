package com.dsjava.graph;

import java.util.*;

public class GraphTraversal {
    public static List<Integer> bfs(GraphAdjacencyList g, int start){
        boolean[] vis = new boolean[g.neighbors(0).size()>0? g.neighbors(0).size()+g.neighbors(0).size() : 100];
        // safer: use n from reflection - but for simplicity use adjacency size n
        int n = g.neighbors(0).size() + g.neighbors(0).size() + 100;
        vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start); List<Integer> out = new ArrayList<>(); Set<Integer> seen = new HashSet<>();
        seen.add(start);
        while(!q.isEmpty()){
            int u = q.poll(); out.add(u);
            for(int v: g.neighbors(u)){
                if(!seen.contains(v)){ seen.add(v); q.add(v); }
            }
        }
        return out;
    }
}
