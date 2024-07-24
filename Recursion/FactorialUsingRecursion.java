public class FactorialUsingRecursion {
    public static void main(String args[])
    {
        int answer=fact(5);
        System.out.println(answer);
    }
    static public int fact(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num * fact(num-1);
    }
}
