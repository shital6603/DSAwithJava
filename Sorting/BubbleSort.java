public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = { 45, 76, 2, 34, 22 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < (arr.length) - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
