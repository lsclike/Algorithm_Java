package com.Al.chapter2_sorting;

import java.util.Arrays;

public class sortingPractice {
    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    private static void exchange(Object[] arr, int a, int b){
        Object temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void show(Comparable[] arr){
        for (Object ob: arr
                ) {
            System.out.print(ob+" ");
        }
    }

    private static boolean isSorted(Comparable[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            if (less(arr[i], arr[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void SelectionSort(Comparable[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (less(arr[j], arr[i])){
                    min = j;
                }
            }
            exchange(arr, min, i);
        }
        assert isSorted(arr);
    }

    public static void InsertionSort(Comparable[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++){
            for (int j = i; j > 0 && (less(arr[j], arr[j-1])); j--){
                exchange(arr, j, j-1);
            }
        }
        isSorted(arr);
    }

    public static void ShellSort(Comparable[] arr){
        int length = arr.length;
        int h = 1;
        while( h < length/3) h = 3*h + 1;

        while (h >= 1){
            for (int i = h; i < length; i++){
                for(int j = i; j >= h && less(arr[j], arr[j-h]); j-=h){
                    exchange(arr, j, j-h);
                }
            }
            h /= 3;
        }
    }

    private static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi){
        for (int i = lo; i <= hi; i++){
            aux[i] = arr[i];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++){
            if (i > mid) arr[k] = aux[j++];
            else if (j > hi)  arr[k] = aux[i++];
            else if (less(aux[j], aux[i])) arr[k] = aux[j++];
            else arr[k] = aux[i++];
        }
    }

    private static void sort(Comparable[] arr, Comparable[] aux, int lo, int hi){
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, aux, lo, mid);
        sort(arr, aux, mid+1, hi);
        merge(arr, aux, lo, mid, hi);
    }

    public static void MergeSort(Comparable[] arr){
        Comparable[] aux = new Comparable[arr.length];
        sort(arr, aux, 0, arr.length-1);
        assert isSorted(arr);
    }


    public static void main(String[] args){
        Integer[] test = {4,3,2,1,0};
        MergeSort(test);
        show(test);
    }
}
