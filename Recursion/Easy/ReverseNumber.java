public class ReverseNumber {
    static int sum=0;
    public static void main(String[] args)
    {
        reverse(67845);
        System.out.println(sum);
    }
    public static void reverse(int num)
    {
        if (num==0) {
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverse(num/10);

    }
    
}
