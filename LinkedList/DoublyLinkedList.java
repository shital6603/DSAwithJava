public class DoublyLinkedList {
        Node head=null;
        Node tail=null;
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.next=next;
            this.data=data;
            this.prev=prev;
        }
    }
    public void insertAtFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            head.prev=null;
            head.next=null;
            tail.prev=null;
            tail.next=null;
        }
        else{
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList ll=new DoublyLinkedList();
        ll.insertAtFirst(90);
        ll.insertAtFirst(57);
        ll.insertAtFirst(57);
        ll.display();
    }
}
