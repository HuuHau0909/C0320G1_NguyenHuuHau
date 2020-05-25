package DataStructures.ThucHanh.MyLinkedlist;


public class MyLinkedList {
    private int numNodes;
    private Node head;

    private class Node {
        private Object data;
        private Node next;

        private Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
//        numNodes++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        numNodes++;


    }
}
