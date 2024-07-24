import java.util.Scanner;

class NumberisPalindromeorNot {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println("Enter any number to check is it palindrome or not :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Your enterd number is :" + num);
        rev(num);
        System.out.println("Reversed number of your entered number is :" + sum);
        if (num == sum) {
            System.out.println("Number is palindrome !!");
        } else {
            System.out.println("Number is not palindrome !!");
        }
    }

    public static int rev(int num) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        return rev(num / 10);

    }
}