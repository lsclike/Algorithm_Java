package com.Al.Tree;

import edu.princeton.cs.algs4.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree<K extends Comparable<K>, V>{
    private Node root;
    private class Node {
        private K key;
        private V value;
        private int size;
        private Node leftChild, rightChild;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
            this.size = 1;
        }
    }
    public void put(K key, V value){
        if (key == null) throw new IllegalArgumentException();
        if (value == null) {
            delete(key);
            return;
        }
        root = put(key, value, root);
    }

    private Node put(K key, V value, Node node){
        if (node == null) return new Node(key, value);
        int cmpt = key.compareTo(node.key);
        if (cmpt > 0){
            node.rightChild = put(key, value, node.rightChild);
        } else if (cmpt < 0){
            node.leftChild = put(key, value, node.leftChild);
        } else {
            node.value = value;
        }
        node.size = size(node.leftChild) + size(node.rightChild) + 1;
        return node;
    }
    public V get(K key){
        return get(root, key);
    }

    private V get(Node node, K key){
        if (key == null) throw new IllegalArgumentException();
        if (node == null) return null;
        int cmpt = key.compareTo(node.key);
        if (cmpt > 0){
            return get(node.rightChild, key);
        } else if (cmpt < 0){
            return get(node.leftChild, key);
        } else {
            return node.value;
        }
    }

    public void delete(K key){}

    public int size(){
        return size(root);
    }

    private int size(Node node){
        if (node == null) return 0;
        return node.size;
    }

    public Iterable<K> levelOrder(){
        List<K> result = new ArrayList<>();
        Queue<Node> nodeQueue = new Queue<>();
        nodeQueue.enqueue(root);
        while (!nodeQueue.isEmpty()){
            Node popedNode = nodeQueue.dequeue();
            if (popedNode == null) { continue;}
            result.add(popedNode.key);
            nodeQueue.enqueue(popedNode.leftChild);
            nodeQueue.enqueue(popedNode.rightChild);
        }
        return result;
    }

    public Iterable<K> inOrderTravel(){
        Node p = root;
        List<K> keys = new ArrayList<>();
        Stack<Node> nodes = new Stack<>();
        while ( p != null || !nodes.isEmpty()){
            while (p != null){
                nodes.add(p);
                p = p.leftChild;
            }
            p = nodes.pop();
            keys.add(p.key);
            p = p.rightChild;
        }
        return keys;
    }

    public Iterable<K> postOrderTravel(){
        Node startNode = root;
        List<K> keys = new ArrayList<>();
        Stack<Node> nodes = new Stack<>();
        while( startNode != null || !nodes.isEmpty()){
            if (startNode != null){
                nodes.add(startNode);
                startNode = startNode.leftChild;
            }
            else {
                Node temp = nodes.peek().rightChild;
                if (temp == null){
                    temp = nodes.pop();
                    keys.add(temp.key);
                    while (!nodes.isEmpty() && temp == nodes.peek().rightChild){
                        temp = nodes.pop();
                        keys.add(temp.key);
                    }
                }
                else {
                    startNode = temp;
                }
            }
        }
        return keys;
    }

    public Iterable<K> preOrderTravel(){
        Node startNode = root;
        List<K> keys = new ArrayList<>();
        Stack<Node> nodes = new Stack<>();
        while ( startNode != null || !nodes.isEmpty()){
            if (startNode != null){
                nodes.add(startNode);
                keys.add(startNode.key);
                startNode = startNode.leftChild;
            } else {
                startNode = nodes.pop();
                startNode = startNode.rightChild;
            }
        }
        return keys;
    }

    public static void main (String[] args){
        BinarySearchTree<Integer, String> test = new BinarySearchTree<>();
        test.put(20, "a");
        test.put(15, "b");
        test.put(10, "c");
        test.put(16, "d");
        test.put(25, "e");
        test.put(23, "f");
        test.put(26, "g");
        System.out.println(test.root);
        System.out.println(test.size());
        for (Integer key: test.postOrderTravel()
             ) {
            System.out.print(key + "\t");
        }
    }
}
