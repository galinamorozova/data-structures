package com.company;



// hashTable - используют много памяти, но при этом операции поиска, вставки, удаления по ним быстрые.
//каждый объект содержит ключ-значение, ключ должен быть уникален. Нельзя чтобы ключ или значение были null ( в отличие
// от hashMap
//Это массив из объектов, у каждого из которых есть хэш-код. Есть функция хэширования, с помощью которой из хэш-кода
// высчитывается натуральное число - индекс, по этому индексу помещаем новый объект в нужное место массива.

// нужна функция присвоения хеш-кода
// нужна функция хэширования, из которой мы получаем индекс
//функция add, добавляющая элемент в соответствующий слот изначального массива
public class Main {

    public static  void main(String[] args) {

        HashTable hashTable = new HashTable();
        hashTable.add(5, "key1", "value1");
        hashTable.add(5, "key2", "value2");
        hashTable.add(5, "key3", "value3");
        hashTable.output();
        hashTable.search(0);
        hashTable.searchKey("key1");
        hashTable.searchKey("key2");
        hashTable.searchKey("key");
        hashTable.remove(8);
        hashTable.output();
    }


    }

