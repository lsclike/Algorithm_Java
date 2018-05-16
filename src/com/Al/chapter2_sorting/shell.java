package com.Al.chapter2_sorting;

public class shell {
    public static  void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while (h < N/3 ) { h = 3*h + 1; }
        while ( h >= 1 )
        {
            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -=h ) {
                    exch(a, j, j - h);
                }
            }
            h = h/3;
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        int swap = i;
        i = j;
        j = swap;
    }
}
