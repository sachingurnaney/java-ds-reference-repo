package com.dsjava.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] a){ if(a.length<=1) return; int mid = a.length/2; int[] l = java.util.Arrays.copyOfRange(a,0,mid); int[] r = java.util.Arrays.copyOfRange(a,mid,a.length); sort(l); sort(r); merge(l,r,a); }
    private static void merge(int[] l,int[] r,int[] a){ int i=0,j=0,k=0; while(i<l.length && j<r.length) a[k++] = (l[i] <= r[j]) ? l[i++] : r[j++]; while(i<l.length) a[k++]=l[i++]; while(j<r.length) a[k++]=r[j++]; }
}
