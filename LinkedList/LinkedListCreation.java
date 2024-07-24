

import java.util.*;

public class LinkedListCreation {

    Node head;
    Node tail;

    int size = 0;

    public LinkedListCreation() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
        }
        tail.next = node;
        tail = node;
        size += 1;

    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    public static void main(String args[]) {
        LinkedListCreation list = new LinkedListCreation();
        list.insertFirst(67);

    }

}
