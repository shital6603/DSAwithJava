class SelectionSort {
    public static void main(String args[]) {
        int min,temp=0;
        int arr[]={45,67,4,3,93,23,11};

        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<min)
                {
                    min=j;
                }
                
            }
        }
    }
}