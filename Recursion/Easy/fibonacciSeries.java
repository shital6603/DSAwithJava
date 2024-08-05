
class fibonacciSeries {
    // recursion funcction

    static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    // iterative implementation function
    static void iterativeDemo(int count) {
        int num1 = 0, num2 = 1, num3 = 0;
        System.out.println(num1 + "\n" + num2);
        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }

    }

    public static void main(String args[]) {
        int count = 10;
        System.out.println("-------------   Recursive Method   ---------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(printFibonacci(i) + " ");
        }
        System.out.println("-------------   Iterative Method   ---------------------------");
        iterativeDemo(10);

    }
}
