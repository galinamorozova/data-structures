package com.company;

public class HashTable {
    Object [] theHashArray = new Object[5];



    class ArrayElement {

        int hCode;
        String key;
        String value;
        int index;

        public ArrayElement (int arraySize, String key, String value) {
            this.hCode = getHCode(arraySize);
            this.index = doubleHashing(arraySize);
            this.key = key;
            this.value = value;
        }
        public int getHCode (int arraySize) {
            int hCode = (int)(Math.random() * (((arraySize*10-1) - arraySize) + 1)) + arraySize;
            return hCode;
        }
         public int doubleHashing ( int arraySize){
            int index = this.hCode % arraySize;
            int hCode = this.hCode;
            System.out.println("первый хэшкод" + this.hCode);
            for (int i = 0; i < theHashArray.length-1; i ++) {
                if (theHashArray[index] != null) {
                    hCode = getHCode(arraySize);
                    index = hCode % arraySize;
                } else break;
            }
            this.hCode = hCode;
            System.out.println("второй хэшкод" + this.hCode);
             System.out.println("итоговый индекс" + index);
            return index;
        }
    }

    public void add (int arraySize, String key, String value) {
        ArrayElement arrayElement = new ArrayElement(arraySize, key, value);
        int i = arrayElement.index;
        this.theHashArray[i] = arrayElement;
        System.out.println("индекс при создании" + arrayElement.index);
        System.out.println("хэшкод при создании" + arrayElement.hCode);

    }

    public void search (int index) {
        ArrayElement arrayElement;
        if (this.theHashArray[index] == null) {
            System.out.println(this.theHashArray[index]);
        } else {
            arrayElement = (ArrayElement) this.theHashArray[index];
            System.out.println("[" + arrayElement.hCode + " " + arrayElement.index + " " +
                    arrayElement.key + " " + arrayElement.value + "]");
        };
    };

    public void searchKey (String key) {
        ArrayElement arrayElement;
        for (int i = 0; i <= this.theHashArray.length-1; i++) {
            arrayElement = (ArrayElement) this.theHashArray[i];
            if (arrayElement != null && arrayElement.key == key) {
                System.out.println( "найденный элемент" + "[" + arrayElement.hCode + " " + arrayElement.index + " " +
                        arrayElement.key + " " + arrayElement.value + "]");
                break;
            } else if ((i == this.theHashArray.length-1 && arrayElement == null) ||
                    (i == this.theHashArray.length-1 && arrayElement.key != key)) {
                System.out.println ("not found");
                }
        }
    };

    public void remove (int index) {
        if (index < this.theHashArray.length-1) {
            this.theHashArray[index] = null;
        } else {
            System.out.println ("not found such index");
        }
    }

    public void output () {
        ArrayElement newArray;
        for (int i = 0; i < this.theHashArray.length; i++) {
            if (this.theHashArray[i] == null) {
                System.out.println(this.theHashArray[i]);
            } else if (this.theHashArray[i] != null) {
                newArray = (ArrayElement) this.theHashArray[i];
                System.out.println("[" + newArray.hCode + " " + newArray.index + " " + newArray.key +
                        " " + newArray.value + "]");
            }

        }
    }
}
