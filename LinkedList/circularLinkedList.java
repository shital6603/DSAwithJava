public class circularLinkedList {
    Node head=null;
    Node tail=null;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=next;
        }
    }
    public void insertAtFirst(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            tail=node;
            tail.next=head;
        }
        else{
            tail.next=node;
            tail=node;
            tail.next=head;
        }
    }
    public void display()
    {
        Node temp=head;
        do {
            System.out.println(temp.data+" ");
            temp=temp.next;
        } while (temp!=head);
    }
    public static void main(String[] args) {
        circularLinkedList ll=new circularLinkedList();
        ll.insertAtFirst(89);
        ll.insertAtFirst(78);
        ll.insertAtFirst(34);
        ll.insertAtFirst(56);
        System.out.println("Circular Linked list is :");
        ll.display();
    }
}
