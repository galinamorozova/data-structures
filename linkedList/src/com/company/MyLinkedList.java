package com.company;

public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public class Node {
        public String data;
        public Node next;

        public Node (String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add (String data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void addAt (int index, String data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (index == 0 && head != null) {
            newNode.next = currentNode;
            head = newNode;
        } else {
            for (int i=0; i<index-1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

    }

    public void addFirst (String data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        newNode.next = currentNode;
        head = newNode;
    }

    public void remove (int index) {
        Node currentNode = head;
        Node previousNode = null;

        if (index == 0 && head != null) {
            head = currentNode.next;
        } else {
            for (int i = 0; i < index; i++) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = currentNode.next;

        }
    }

    public void output () {
        Node currentNode = head;
        if (head !=null) {
            System.out.println(head.data);
        }
        while (currentNode.next !=null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }
}
