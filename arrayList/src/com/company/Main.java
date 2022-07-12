package com.company;

//arraylist  - динамический массив, размер которого может изменяться в процессе выполнения программы
// по умолчанию размер 10
//по умолчанию добавляется элемент в конец массива


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();



//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("синий");
//        System.out.println(colors);
//
//        String yellow = "желтый";
//        colors.add(yellow);
//        System.out.println(colors);
//
//        colors.add(0, "красный");
//        System.out.println(colors);
//
//        System.out.println(colors.get(1));
//
//        for(int i=0; i<colors.size(); i++){
//            System.out.println(colors.get(i));
//        }
//
//        colors.remove(0);
//        System.out.println(colors);
//
//        colors.remove(yellow);
//        System.out.println(colors);
//
//        colors.set(0, "зеленый");
//        System.out.println(colors);
//
//        colors.clear();
//        System.out.println(colors);

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        //myArrayList.add(8);

        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.addIndex(5, 0);
        myArrayList.addIndex(4, 0);
        myArrayList.addIndex(3, 0);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.add(13);
        myArrayList.remove(0);
        myArrayList.add(7);
        myArrayList.transter(0, 1);
        myArrayList.transter(3, 1);
        System.out.println(myArrayList.toString());
   }

}