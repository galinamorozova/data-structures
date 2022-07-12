package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//
//        colors.add("green");
//        colors.add("red");
//        colors.add("brown");
//        colors.add("blue");
//        colors.remove(2);
//        colors.add(2, "yellow");
//        colors.addLast("white");
//
//        System.out.println(colors);


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("red");
        myLinkedList.add("blue");
        myLinkedList.add("4");
        //myLinkedList.addAt(2, "aaaaaa");
        myLinkedList.add("3");
        myLinkedList.addFirst("first");

        //myLinkedList.remove(2);
        myLinkedList.output();
        myLinkedList.add("black");

    }

}
