public class Printing1to5usingRecusion {
    public static void main(String[] args) {
        funPrnt1to5(1);
        System.out.println();
        funPrntRev(1);
        System.out.println();
        funPrntRev2(5);
    }

    public static void funPrntRev(int n) 
    {
        if (n == 6) 
        {
            return;
        }
        funPrntRev(n + 1);
        System.out.print(n + " ");

    }

    public static void funPrntRev2(int num2) 
    {
        if (num2 == 0)
        {
            return;
        }
        funPrntRev(num2 - 1);
        System.out.println(num2 + " ");

    }

    static void funPrnt1to5(int n) // Output will be 1 2 3 4 5
    {
        if (n == 6) 
        {
            return;
        }
        System.out.print(n + " ");
        funPrnt1to5(n + 1);

    }
}
