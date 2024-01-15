public class MergeTwoSortedArrays {

    public static void printArray(int[] arr){
        for(int j: arr){
            System.out.println(j);
        }
    }

    public static int[] merge2SortedArrays(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int m = arr1.length;
        int n = arr2.length;
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n){
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,7,9};
        int[] arr2 = {0,2,4,8};
        int[] arr3 = merge2SortedArrays(arr1,arr2);
        printArray(arr3);

    }
}
