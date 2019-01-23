package com.Al.CS61B;

import java.util.HashMap;
import java.util.Map;

public class DisjointSetsImplementation implements DisjointSets{
    private HashMap<Integer, Integer> container = new HashMap<>();


    public int size(){
        return container.size();
    }

    private boolean isEmpty(){
        return this.container.isEmpty();
    }

    @Override
    public void connect(int p, int q) {
        if (!container.containsKey(p) || !container.containsKey(q)) {
            if (!container.containsKey(p) && !container.containsKey(q)) {
                container.put(p, p);
                container.put(q, p);
            } else {
                if (!container.containsKey(p)) {
                    container.put(p, container.get(q));
                } else {
                    container.put(q, container.get(p));
                }
            }
        }
        else {
            if (setSizeOfValues(p) > setSizeOfValues(q)) {
                Integer temp = container.get(q);
                for (Map.Entry<Integer, Integer> entry : container.entrySet()) {
                    if (entry.getValue().equals(temp)) {
                        container.put(entry.getKey(), container.get(p));
                    }
                }
            } else {
                Integer temp = container.get(p);
                for (Map.Entry<Integer, Integer> entry : container.entrySet()) {
                    if (entry.getValue().equals(temp)){
                        container.put(entry.getKey(), container.get(q));
                    }
                }
            }
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        if (isEmpty()){
            return false;
        } else {
            if ( container.get(p) == null && container.get(q) == null){
                return false;
            }
            return container.get(p).equals(container.get(q));
        }
    }

    public int setSizeOfValues(int p){
        int total = 0;
        for (Map.Entry<Integer, Integer> entry: container.entrySet()){
            if(entry.getValue().equals(container.get(p))){
                total += 1;
            }
        }
        return total;
    }

    public static void main (String[] args){
        DisjointSetsImplementation test = new DisjointSetsImplementation();
        test.connect(1, 2);
        test.connect(6, 3);
        test.connect(3,5);
        test.connect(6,1);
        for (Map.Entry<Integer, Integer> entry: test.container.entrySet()) {
            String printed = String.format("the key is %3d the value is %3d", entry.getKey(), entry.getValue());
            System.out.println(printed);
        }

    }
}
