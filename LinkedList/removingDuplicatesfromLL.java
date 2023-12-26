import java.util.*;
public class removingDuplicatesfromLL {
    private Node head;
    private Node tail;
    private int size;

    public removingDuplicatesfromLL()
    {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next = node;
        size++;
    }
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp =head;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        Node node=new Node(val, temp.next);
        temp.next=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value  +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void removeDuplicateElements()
    {
        if(head==null)
        {
            return;
        }
        Node current=head;
        while(current !=null && current.next!=null)
        {
            if(current.value==current.next.value)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }

    }
    public class Node
    {
         int value;
         Node next;
        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
   
    public static void main(String[] args) {
        removingDuplicatesfromLL list=new removingDuplicatesfromLL();
        list.insertFirst(43);
        list.insertFirst(90);
        list.insertFirst(67);
        list.display();
        list.insertLast(34);
        list.insertLast(78);
        list.removeDuplicateElements();
        list.display();
        //System.out.println("The size of the linked list is"+size);
    }
}
