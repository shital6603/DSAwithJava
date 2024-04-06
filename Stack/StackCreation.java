import java.util.*;
public class StackCreation {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int stack[]=new int[size];
    int top=0;
    boolean isempty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    boolean isfull()
    {
        if(top==size-1)
        {
            return true;
        }
        return false;
    }
    void push(int data)
    {
        if (isfull()) {
            System.out.println("Stack is full !!");
        } 
        for (int i = 0; i < stack.length; i++) {
            stack[i]=data;
        }
    }
    void display()
    {
        if(isempty())
        {
            System.out.println("Empty !!!");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stack[i]);
        } 
    }
    public static void main(String[] args) {
        StackCreation ss=new StackCreation();
        ss.push(78);
        //ss.display();
    }
}
