public class DIgitProduct {
    public static void main(String args[])
    {

        int result=prod(587);
        System.out.println(result);
    }
    public static int prod(int num)
    {
        if(num%10==num)
        {
            return num;
        }
        return (num%10) * prod(num/10);
    }
}
