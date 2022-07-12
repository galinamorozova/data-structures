package com.company;

public class HashTable {
    Object [] theHashArray;
    int arraySize;


    class ArrayElement {

        int hCode;
        String key;
        String value;
        int index;

        public ArrayElement (int arraySize, String key, String value) {
            this.hCode = (int)Math.random() * (arraySize*10 - arraySize);
            this.index = this.hCode % arraySize;
            this.key = key;
            this.value = value;
        }
    }

    public void add (int arraySize, String key, String value) {
        ArrayElement arrayElement = new ArrayElement(arraySize, key, value);
        theHashArray[arrayElement.index] = arrayElement;

    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (Object s : theHashArray) {
            sb.append(s);
        }
        return sb.toString();
    }
    public void output () {
        for (int i = 0; i < theHashArray.length; i++) {
            System.out.println(theHashArray[i]);
        }
    }
