package com.company;

public class MyArrayList<T> {

    private final int INIT_SIZE = 8;
    private Object[] myArrayList = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add (T item) {
        if (pointer == myArrayList.length-1) {
            size(myArrayList.length+5);
        }
        myArrayList[pointer++] = item;
    }
    public void addIndex (T item, int index) {
        if (pointer == myArrayList.length-1) {
            size(myArrayList.length+1);
        }
       for (int i = pointer-1; i >= index; i--) {
           myArrayList[i+1] = myArrayList[i];
       }
       pointer++;
       myArrayList[index] = item;
    }

    public void remove (int index) {
        for (int i = index; i < pointer; i ++) {
            myArrayList[i] = myArrayList[i+1];
        }
        myArrayList[pointer] = null;
        pointer--;

    }

    public T transter (int indexF, int indexL) {
        T buffer;
        buffer = (T) myArrayList[indexF];
        remove(indexF);
        addIndex(buffer, indexL);
        return (T) myArrayList;
    }

    public T get(int index) {
        return (T) myArrayList[index];
    }


    private void size (int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(myArrayList, 0, newArray, 0, pointer);
        myArrayList = newArray;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (Object s : myArrayList) {
            sb.append(s);
        }
        return sb.toString();
    }
}
