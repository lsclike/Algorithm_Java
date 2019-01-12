package com.Al.HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static ArrayList<Integer> findItems(Integer[] theArrayList, int sum){
        ArrayList<Integer> result = new ArrayList<>(2);
        HashMap<Integer, Integer> compensation_dictionary = new HashMap<>();
        boolean find = false;
        for (int i = 0; i < theArrayList.length && !find; i++){
            int requiredNumber = sum - theArrayList[i];
            if (compensation_dictionary.containsKey(requiredNumber)){
                result.add(i);
                result.add(compensation_dictionary.get(requiredNumber));
                find = true;
            } else if(compensation_dictionary.containsKey(theArrayList[i])){
                continue;
            }
            compensation_dictionary.put(theArrayList[i], i);
        }
        return result;
    }

    public static void main(String[] args){
        Integer[] test = {1, 2, 3, 4, 5, 6};
        int sum = 7;
        ArrayList<Integer> result = findItems(test, sum);
        System.out.println(result);
    }
}
