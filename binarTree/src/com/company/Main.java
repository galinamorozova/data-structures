package com.company;

// 1. 0 / 1 / 2 потомка
// 2. левый потомок меньше, чем корень
// 3. правый потомок больше или равен корню

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap treemap = new TreeMap();
        Tree tree = new Tree();

        tree.insertNode(16);
        tree.insertNode(11);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(5);
        tree.insertNode(27);
        tree.insertNode(34);
        tree.insertNode(20);
        tree.insertNode(10);
        tree.insertNode(1);
        tree.insertNode(30);
        tree.insertNode(35);
        tree.insertNode(37);
        tree.insertNode(31);
        tree.insertNode(29);
        tree.insertNode(6);
        tree.insertNode(3);
        tree.insertNode(3);



        //tree.outprint();
//        tree.getMinimum();
//        tree.getMaximum();


        //tree.findNode(20);

        tree.deleteNode(5);
        tree.outprint();
    }
}

