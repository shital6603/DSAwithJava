public class SumofFirstNnaturalNumbersUsingRecursion {
    public static void printSumofNumbers(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        System.out.println("Value of i :" + i);
        printSumofNumbers(i + 1, n, sum);

    }

    public static void main(String[] args) {
        // SumofFirstNnaturalNumbersUsingRecursion ss=new
        // SumofFirstNnaturalNumbersUsingRecursion();
        printSumofNumbers(1, 5, 0);
    }
}
