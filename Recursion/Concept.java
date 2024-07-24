public class Concept {
    public static void main(String[] args)
    {
        concept(5);
    }
    public static void concept(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        concept(num--);             //will go in infinite loop it will print value first then decreases vaalue of num  
        concept(--num);
    }
}