package com.company;

import java.util.ArrayList;

public class MyHashMap {

    private final int INIT_SIZE = 18;
    private Node[] myArray = new Node[INIT_SIZE];
    private int pointer = 0;


    public class Node {
        public int hash;
        public int key;
        public String value;
        public Node next;

        public Node(int key, String value, int size) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.hash = key % size;
        }
    }

    private void resize (int newLength) {
        Node[] newArray = new Node[newLength];
        System.arraycopy(myArray, 0, newArray, 0, myArray.length);
        myArray = newArray;
    }
    public void add (Integer key, String value) {
        Node newNode = new Node(key, value, myArray.length);
        Node currentNode;
        int index = newNode.hash;
        if (pointer == myArray.length*0.75) {
            resize(myArray.length*2);
        }
        if (myArray[index] != null) {
            currentNode = myArray[index];
            if (currentNode.key == newNode.key) {
                myArray[index] = newNode;
                } else {
                while (currentNode.next !=null && currentNode.next.key != newNode.key) {
                        currentNode = currentNode.next;
                }
                currentNode.next = newNode;
                pointer++;
            }
        } else {
            myArray[index] = newNode;
            pointer++;
        }
    }

    public void remove (int key) {
        Node currentNode;
        Node previosNode;
        int index = key % myArray.length;
        currentNode = myArray[index];
        if (currentNode != null) {
            if (currentNode.key == key && currentNode.next == null) {
                myArray[index] = null;
            } else if (currentNode.key == key && currentNode.next != null){
                myArray[index] = currentNode.next;
            } else if (currentNode.key != key || currentNode.next != null) {
                previosNode = currentNode;
                currentNode = currentNode.next;
                while (true) {
                    if (currentNode!= null && currentNode.key == key) break;
                    if (currentNode != null && currentNode.next == null) break;
                    previosNode = currentNode;
                    currentNode = currentNode.next;
                }
                if (currentNode.next == null && currentNode.key == key) {
                    previosNode.next = null;
                } else if (currentNode.key == key && currentNode.next != null) {
                    previosNode.next = currentNode.next;
                } else if (currentNode.key != key && currentNode.next == null) {
                    System.out.println(" нет такого ключа ");
                }
            }
        }
    }

    public void get ( int key) {
        Node currentNode;
        int index = key % myArray.length;
        currentNode = myArray[index];
        if (currentNode.key == key) {
            System.out.println(currentNode.value);
        } else if (currentNode.key != key && currentNode.next == null) {
            System.out.println(" нет такого ключа ");
        } else if (currentNode.key !=key && currentNode.next != null) {
            currentNode = currentNode.next;

            while (true) {
                if (currentNode!= null && currentNode.key == key) break;
                if (currentNode != null && currentNode.next == null) break;
                currentNode = currentNode.next;
            }
            if (currentNode.key == key) {
                System.out.println(currentNode.value);
            } else {
                System.out.println(" нет такого ключа ");
            }

        }
    }
    public void containsKey (int key) {
        Node currentNode;
        int index = key % myArray.length;
        currentNode = myArray[index];
        if (currentNode == null) {
            System.out.println("false");
        } else if (currentNode.key == key) {
            System.out.println("true");
        } else if (currentNode.key != key && currentNode.next == null) {
            System.out.println("false");
        } else if (currentNode.key != key && currentNode.next != null) {
            while (true) {
                if (currentNode!= null && currentNode.key == key) break;
                if (currentNode != null && currentNode.next == null) break;
                currentNode = currentNode.next;
            }
            if (currentNode.key == key) {
                System.out.println("node true");
            } else {
                System.out.println("node false");
            }
        }

    }
    public boolean containsKey2 ( int key) {
        ArrayList<Integer> keyArray;
        keyArray = keySet2();
        boolean theAnswer = false;
        for (int i = 0; i < keyArray.size(); i++) {
            if (keyArray.get(i) == key) {
                theAnswer = true;
                break;
            } else {
                theAnswer = false;
            }
        }
        System.out.println(theAnswer);
        return theAnswer;
    }
    public boolean containsValue ( String value) {
        ArrayList<String> valueArray;
        valueArray = valueSet();
        boolean theAnswer = false;
        for (int i = 0; i < valueArray.size(); i++) {
            if (valueArray.get(i) == value) {
                theAnswer = true;
                break;
            } else {
                theAnswer = false;
            }
        }
        System.out.println(theAnswer);
        return theAnswer;
    }

    public void keySet () {
        Node currentNode;
        for (int i = 0; i < myArray.length; i ++) {
            currentNode = myArray[i];
            if (currentNode != null) {
                System.out.println(currentNode.key);
                while (true) {
                    if (currentNode != null && currentNode.next == null) break;
                    currentNode = currentNode.next;
                    System.out.println(currentNode.key);
                }
            }
        }
    }

    public ArrayList keySet2 () {
        Node currentNode;
        ArrayList<Integer> keyArray = new ArrayList<>();
        for (int i = 0; i< myArray.length; i++) {
            currentNode = myArray[i];
            if (currentNode !=null && currentNode.next == null) {
                keyArray.add(currentNode.key);
            } else if (currentNode !=null && currentNode.next != null ) {
                while (true) {
                    if (currentNode != null && currentNode.next == null) break;
                    keyArray.add(currentNode.key);
                    currentNode = currentNode.next;
                }
                keyArray.add(currentNode.key);
            }
        }
        System.out.println(keyArray);
        return keyArray;

    };
    public ArrayList valueSet () {
        Node currentNode;
        ArrayList<String> valueArray = new ArrayList<>();
        for (int i = 0; i< myArray.length; i++) {
            currentNode = myArray[i];
            if (currentNode !=null && currentNode.next == null) {
                valueArray.add(currentNode.value);
            } else if (currentNode !=null && currentNode.next != null ) {
                while (true) {
                    if (currentNode != null && currentNode.next == null) break;
                    valueArray.add(currentNode.value);
                    currentNode = currentNode.next;
                }
                valueArray.add(currentNode.value);
            }
        }
        System.out.println(valueArray);
        return valueArray;
    }
    public Integer size () {
        int size = 0;
        Node currentNode;
        ArrayList<Node> nodeArray = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            currentNode = myArray[i];
            if (currentNode != null && currentNode.next == null) {
                nodeArray.add(currentNode);
            } else if (currentNode != null && currentNode.next != null) {
                while (true) {
                    if (currentNode != null && currentNode.next == null) break;
                    nodeArray.add(currentNode);
                    currentNode = currentNode.next;
                }
                nodeArray.add(currentNode);
            }
        }
        size = nodeArray.size();
        System.out.println(size);
        //nodeArray.forEach(node -> System.out.println(node.value));
        return size;
    }


    public void output () {
        Node newNode;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                System.out.println(myArray[i]);
            } else if (myArray[i] != null) {
                newNode = myArray[i];
                System.out.println("узел в массиве под индексом" + " " + newNode.hash + " " +"[" + newNode.key + " " + newNode.value + "]");
                while (newNode.next != null) {
                    newNode = newNode.next;
                    System.out.println( "связанный список в ячейке под индексом" + " " + newNode.hash + " " +
                            "[" + newNode.key + " " + newNode.value + "]");
                }
            }

        }
    }



}
