
public class Printing5to1usingRecursion {
    static void print5to1(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        print5to1(num-1);
        
    }
    
    public static void main(String args[])
    {
        print5to1(5);
    }
}
