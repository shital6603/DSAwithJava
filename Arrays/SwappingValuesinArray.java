import java.util.Scanner;

public class SwappingValuesinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Before swapping ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        swap(array1, 3, 4);
        System.out.println("\nAfter swapping ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    static void swap(int[] array1, int index1, int index2) {
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[index1];
            array1[index1] = array1[index2];
            array1[index2] = temp;
        }
    }
}
