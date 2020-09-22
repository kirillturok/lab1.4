package com.company;

public class List2<K> {

    private int size = 0;
    private Node<K> head = null;
    private Node<K> tail = null;

    private class Node<K> {
        int data;
        Node<K> prev, next;

        public Node(int data, Node<K> prev, Node<K> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }


    public int size() {
        return size;
    }


    public void add(int elem) {
        if (size() == 0) {
            head = tail = new Node<>(elem, null, null);
        } else {
            tail.next = new Node<>(elem, tail, null);
            tail = tail.next;
        }
        size++;
    }


    public void task(){
        Node<K> temp=tail;
        for (int i=0;i<size;i++){
            Main.list.task(temp.data);
            temp=temp.prev;
        }
    }
}
