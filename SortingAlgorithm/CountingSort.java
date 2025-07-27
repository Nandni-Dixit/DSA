package DSA.SortingAlgorithm;

public class CountingSort {
    public static void countingSort(int[] arr,int n){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest, arr[i]);
        }
        // Defining CountArray
        int[] countArray = new int[largest+1];
        // Iterarting over main array for finding frequency
        for(int i=0;i<n;i++){
            countArray[arr[i]]++;
        }
        // Iterating over count Array for sorting
        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                arr[j] = i;
                j++;
                countArray[i]--;
            }
        }
    }

      public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr ={1,4,1,3,2,7,4};
        countingSort(arr, n);
        printArray(arr, n);
    }
}
