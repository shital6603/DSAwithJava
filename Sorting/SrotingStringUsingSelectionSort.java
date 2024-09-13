
public class SrotingStringUsingSelectionSort {
    public static void main(String args[]) {
        int min;
        String temp = "";
        String arr[] = { "Shital", "Dhannu", "Sanjay", "Ujwala" };
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
