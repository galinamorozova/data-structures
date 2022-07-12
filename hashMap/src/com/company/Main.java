package com.company;

// hashMap каждый элемент - узел.
// Из ключа получаем индекс.
// если индекс одинаковый, то из ячейки делаем связанный список.
// мапа должна расширяться при заполненности в 75 процентов.
//методы resize, add, remove, get (получить значение), size
// мапа реализована с упрощением, когда происходит увеличение массива удаление начинает работать не полностью корректно
//из -за неидеальной хеш-функции

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Number, String> set = new HashMap<>(10);

        MyHashMap myHashMap = new MyHashMap();

        myHashMap.add(125345, "Иванов Семен Семенович");
        myHashMap.add(678456, "Иванов Иван Иванович");
        myHashMap.add(903456, "zzzz");
        myHashMap.add(903632, "yyyy");
        myHashMap.add(903640, "qqqq");
        myHashMap.add(674567, "Петров Павел Михайлович");
        myHashMap.add(987623, "Иванова Светлана Павлова");
        myHashMap.add(667452, "Градюк Ангелина Александровна");
        myHashMap.add(456334, "Романов Сергей Викторович");
        myHashMap.add(983465, "Юдин Вячеслав Семенович");
        myHashMap.add(231467, "Любачев Дмитрий Владимирович");
        myHashMap.add(687345, "Бабкин Роман Владимирович");
        myHashMap.add(874576, "Филиппов Сергей Батькович");
        myHashMap.add(652765, "Филлипова Вера");
        myHashMap.add(876345, "Бердюгина Елена Родионовна");
        myHashMap.add(984585, "Бердюгина Вера Васильевна");
        myHashMap.add(234756, "аааааа");
        myHashMap.add(790823, "ввввв");

        myHashMap.output();
        //myHashMap.remove(234756);
        //myHashMap.get(234756);
        //myHashMap.containsKey(876345);
         //myHashMap.output();
        //myHashMap.keySet();
        //myHashMap.containsValue("Иванов Иван Иванович");
        //myHashMap.valueSet();
        //myHashMap.containsValue("аааааа");
        //myHashMap.keySet2();
       // myHashMap.containsKey2(903456);
        myHashMap.size();
    }
}

