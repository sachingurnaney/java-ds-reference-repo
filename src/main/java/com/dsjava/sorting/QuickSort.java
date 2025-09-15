package com.dsjava.sorting;

public class QuickSort {
    public static void sort(int[] a, int l, int r){
        if(l>=r) return;
        int p = partition(a,l,r);
        sort(a,l,p-1); sort(a,p+1,r);
    }
    private static int partition(int[] a, int l, int r){
        int pivot = a[r]; int i=l;
        for(int j=l;j<r;j++){ if(a[j] < pivot){ int tmp=a[i]; a[i]=a[j]; a[j]=tmp; i++; } }
        int tmp=a[i]; a[i]=a[r]; a[r]=tmp; return i;
    }
}
