package com.Al.chapter1.chapter1_5;

public class UN_QUICK_FIND {
    private int[] id;
    private int count;
    private int[] size;
    public UN_QUICK_FIND(int n ){
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++){
            id[i] = i;
        }
        size = new int[n];
        for (int i = 0; i < n; i++){
            size[i] = 1;
        }
    }

    public int count(){return count;}

    public boolean connected(int p, int q){ return find(p) == find(q);}

//    public int find(int p){ return id[p];}

    public int find(int p )
    {
        while (p != id[p]){
            p = id[p];
        }

        return p;
    }

//    public void union(int p, int q){
//        int pid = find(p);
//        int qid = find(q);
//
//        if (pid == qid){ return;}
//
//        for (int i = 0; i < id.length; i++){
//            if(id[i] == pid) { id[i] = qid; }
//            count--;
//        }
    public void union(int p, int q){
        int proot = find(p);
        int qroot =find(q);
        if (proot==qroot) return;

        if (size[p] < size[q]){
            id[p] = q;
            size[q] +=size[p];
        }
        else {
            id[q] = p;
            size[p] +=size[q];
        }
        count--;

    }

    public static void main (String[] args){

    }
}
