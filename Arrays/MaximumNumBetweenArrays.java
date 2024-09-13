import java.util.*;

public class MaximumNumBetweenArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int maximumVal = findMax(array);
        System.out.println("Max number between arrays : " + maximumVal);

    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
