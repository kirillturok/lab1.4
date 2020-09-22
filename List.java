package com.company;

public class List<K> {

    private int size = 0;
    private Node<K> head = null;

    private class Node<K> {
        int data;
        Node<K> next;

        public Node(int data, Node<K> next) {
            this.data = data;
            this.next = next;
        }
    }


    public int size() {
        return size;
    }


    public void add(int elem) {
        if (size() == 0) {
            head = new Node<K>(elem, null);
            size++;
        } else {
            if (elem<head.data){head=new Node<>(elem,head.next);return;}
            int i;
            Node<K> trav;
            for (i = 0, trav = head; i < size - 1; i++) {
                if (trav.data <= elem && elem <= trav.next.data) {
                    trav.next = new Node<>(elem, trav.next);
                    size++;
                    return;
                }
                trav = trav.next;
            }
            trav.next = new Node<>(elem, null);
            size++;
        }
    }

    public void task(int num) {
        if (num > 999999) {
            add(num);
        }
    }
    public void print(){
        int i;
        Node<K> temp;
        for (i=0, temp=head;i<size;i++){
            System.out.printf("%d\t", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}