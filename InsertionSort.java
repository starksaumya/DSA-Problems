public class InsertionSort {
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(" "+j);
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++){
            //iterating the elements
            int j = i-1;
            int temp = arr[i];

            //loop will run when array is greater than 0 else will give index out of bounds.
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            // storing variable in temp which place is empty.
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr ={9,0,2,4,6,1,9,0};
        insertionSort(arr);
        printArray(arr);
    }


}
