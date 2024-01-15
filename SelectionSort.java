public class SelectionSort {
    public static void selectionSort(int[] arr, int n){
         n = arr.length;
         for(int i = 0; i < n-1; i++){
             int min = arr[i], minIndex = i;
             for(int j = i+1; j < n; j++){
                 if(arr[j]<min){
                     min = arr[j];
                     minIndex = j;
                 }
             }
             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
         }
    }

    public static void main(String[] args) {
        int[] input = {2,1,5,7,6,3};
        selectionSort(input,6);
        for ( int i = 0; i < 6; i++){
            System.out.println(input[i]);
        }
    }
}
