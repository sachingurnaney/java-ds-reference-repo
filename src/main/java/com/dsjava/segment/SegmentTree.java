package com.dsjava.segment;

public class SegmentTree {
    private final int n; private final int[] tree;
    public SegmentTree(int[] a){ n=a.length; tree=new int[n*4]; build(a,1,0,n-1); }
    private void build(int[] a,int idx,int l,int r){ if(l==r){ tree[idx]=a[l]; return; } int m=(l+r)/2; build(a,idx*2,l,m); build(a,idx*2+1,m+1,r); tree[idx]=tree[idx*2]+tree[idx*2+1]; }
    public int sumRange(int L,int R){ return sumRange(1,0,n-1,L,R); }
    private int sumRange(int idx,int l,int r,int L,int R){ if(R<l||r<L) return 0; if(L<=l&&r<=R) return tree[idx]; int m=(l+r)/2; return sumRange(idx*2,l,m,L,R)+sumRange(idx*2+1,m+1,r,L,R); }
}
