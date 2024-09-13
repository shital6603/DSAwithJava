import java.util.Scanner;

public class reversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[6];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Before reverse");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        reverse(array1);
        System.out.println("\nAfter reverse");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void reverse(int[] array1) {
        int start = 0;
        int end = array1.length - 1;
        while (start < end) {
            swap(array1, start, end);
            start = start + 1;
            end = end - 1;
        }
    }

    public static void swap(int[] array1, int start, int end) {
        for (int i = start; i < end; i++) {
            int temp = array1[start];
            array1[start] = array1[end];
            array1[end] = temp;
        }
    }
}
