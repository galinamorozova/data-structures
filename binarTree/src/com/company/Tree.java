package com.company;

public class Tree {

    private Node root;

    public Tree () {
        root = null;
    }



    class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node (int value) {
            this.value = value;
        }

        public void printNode() {
            if (this.rightChild != null && this.leftChild == null) {
                System.out.println("node's value" + " "+ this.value + " "+ "leftChild" +" "+ "null" +" "+ "rightChild" +" "+ this.rightChild.value);
            }else if (this.rightChild == null && this.leftChild != null) {
                System.out.println("node's value" + " "+ this.value + " "+ "leftChild" +" "+ this.leftChild.value +" "+ "rightChild" +" "+ "null");
            } else if(this.leftChild == null && this.rightChild ==null) {
                System.out.println("node's value" + " "+ this.value + " "+ "leftChild null" +" "+ "rightChild null");
            } else if (this.leftChild != null && this.rightChild !=null) {
                System.out.println("node's value" + " "+ this.value + " "+ "leftChild" +" "+ this.leftChild.value +" "+ "rightChild" +" "+ this.rightChild.value);
            }

        }

    }

    public void findNode(int value){
        Node currentNode = root;
        if (currentNode == null){
            System.out.println("Не найдено");
        } else {
            while (true) {
                if (value == currentNode.value) {
                    System.out.println("find");
                    currentNode.printNode();
                    return;
                } else if (value < currentNode.value) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        System.out.println("Не найдено");
                        return;
                    }
                } else if (value > currentNode.value) {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        System.out.println("Не найдено");
                        return;
                    }
                } else {
                    currentNode.printNode();
                }
            }

        }

    }

    public void insertNode(int value) {
        Node newNode = new Node (value);

        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (newNode.value < currentNode.value) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parentNode.leftChild = newNode;
                        parentNode.printNode();
                        return;
                    }
                } else if (newNode.value > currentNode.value) {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parentNode.rightChild = newNode;
                        parentNode.printNode();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }



    public void deleteNode(int value) {

        // delete root
        // delete leaves
        // delete node with 1 child
        // delete node with 2 children - the last left child of the right child

        Node currentNode = root;

        if (currentNode == null){
            System.out.println("root is null");
        } else {
            boolean isLeft = false;
            Node parentNode=currentNode;
            while (true) {
                if (value == currentNode.value && currentNode == root) {
                    root = null;
                    System.out.println("root is null");
                    return;
                } else if (value == currentNode.value && currentNode.rightChild==null && currentNode.leftChild==null) {
                    if (isLeft) {
                        parentNode.leftChild = null;
                        parentNode.printNode();
                    } else {
                        parentNode.rightChild = null;
                    }
                    return;
                } else if (value == currentNode.value && currentNode.rightChild!=null && currentNode.leftChild==null) {
                    if (isLeft) {
                        parentNode.leftChild = currentNode.rightChild;
                    } else {
                        parentNode.rightChild = currentNode.rightChild;
                    }
                    return;
                } else if (value == currentNode.value && currentNode.rightChild==null && currentNode.leftChild!=null) {
                    if (isLeft) {
                        parentNode.leftChild = currentNode.leftChild;
                    } else {
                        parentNode.rightChild = currentNode.leftChild;
                    }
                    return;
                } else if (value == currentNode.value && currentNode.rightChild!=null && currentNode.leftChild!=null) {
                    Node deleteNode = currentNode;
                    currentNode = currentNode.rightChild;
                    if (currentNode.leftChild==null && !isLeft) {
                        parentNode.rightChild = currentNode;
                        currentNode.leftChild = deleteNode.leftChild;
                    } else if (currentNode.leftChild==null && isLeft) {
                        parentNode.leftChild = currentNode;
                        currentNode.leftChild = deleteNode.leftChild;
                    } else {
                        Node buffer=null;
                        while (currentNode.leftChild != null) {
                            buffer = currentNode;
                            currentNode = currentNode.leftChild;
                        }
                        deleteNode.value = currentNode.value;
                        buffer.leftChild = currentNode.rightChild;
                    }
                    return;
                } else if (value<currentNode.value) {
                    parentNode = currentNode;
                    currentNode = currentNode.leftChild;
                    isLeft = true;
                    if(currentNode == null) {
                        System.out.println("удаляемый узел отсутствует в дереве");
                        return;
                    }
                } else if (value>currentNode.value) {
                    parentNode = currentNode;
                    currentNode = currentNode.rightChild;
                    isLeft = false;
                    if (currentNode == null) {
                        System.out.println("удаляемый узел отсутствует в дереве");
                        return;
                    }
                }
            }
        }
    }




    public void getMaximum() {
        Node currentNode = root;
        if (currentNode != null) {
            while (currentNode.rightChild != null) {
                currentNode = currentNode.rightChild;
            }
            System.out.println("maximum" +" "+ currentNode.value);
        } else System.out.println("null");
    }

    public void getMinimum() {
        Node currentNode = root;
        if (currentNode != null) {
            while (currentNode.leftChild != null) {
                currentNode = currentNode.leftChild;
                currentNode.printNode();
            }
            System.out.println("minimum" +" "+ currentNode.value);
        } else System.out.println("null");

    }



    private void printLCR (Node node) {
        if (node != null) {
            printLCR(node.leftChild);
            if (node.leftChild != null && node.rightChild == null) {
                System.out.println("node" + node.value + " " +
                        "leftChild" + " " + node.leftChild.value + " " + "rightChild null");
            } else if (node.leftChild == null && node.rightChild != null) {
                System.out.println("node" + node.value +" "+
                        "leftChild null" +" "+ "rightChild" +" "+ node.rightChild.value);
            }else if (node.leftChild == null & node.rightChild == null) {
                System.out.println("node" + node.value +" "+
                        "leftChild null" +" "+ "rightChild null");
            } else if (node.leftChild !=null && node.rightChild != null) {
                System.out.println("node" + node.value +" "+
                        "leftChild" +" "+ node.leftChild.value +" "+ "rightChild" +" "+ node.rightChild.value);
            };
            printLCR(node.rightChild);
        }
    }
    public void outprint () {
        printLCR(root);
    }


}
