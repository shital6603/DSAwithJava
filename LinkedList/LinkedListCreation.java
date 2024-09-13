
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "=> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int temp = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
        list.insertFirst(98);
        list.insertFirst(748);
        list.insertFirst(78);
        list.insertFirst(48);
        list.insertFirst(54);
        list.insertFirst(22);
        list.display();
        list.insert(33, 3);
        list.display();

        list.deleteFirst();
        System.out.println("After deleting first element ");
        list.display();

        list.deleteLast();
        System.out.println("After deleting last element ");
        list.display();

        list.delete(1);
        System.out.println("After deleting node at given index");
        list.display();

    }

}
