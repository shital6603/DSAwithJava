
public class CheckingForSortedArray {

    static int  temp = 0;
    public static void main(String[] args) {
        int[] arr= {78, 45, 67, 90 };
        sorted(arr);
       
    }
    static void sorted(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}