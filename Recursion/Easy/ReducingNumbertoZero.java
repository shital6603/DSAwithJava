public class ReducingNumbertoZero {
    static int reduceNumber(int number) {
        return helper(number, 0);
    }

    static int helper(int num,int steps)
    {
        if(num==0)
        {
            return steps;
        }
        if(num%2==0)
        {
            return helper(num/2, steps + 1);
        }
        return helper(num-1, steps+1);
    }
    public static void main(String[] args) {
        System.out.println("Number of steps are :"+reduceNumber(56));
    }
}
