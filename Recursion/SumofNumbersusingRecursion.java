public class SumofNumbersusingRecursion {
    public static void main(String[] args) {
        int result=sumOfNumbers(5);
        System.out.println(result);
    }
    public static int sumOfNumbers(int num)
    {
        if(num<=1)
        {
           return 1;
        }
        return  num + sumOfNumbers(num-1);
        

    }
}
