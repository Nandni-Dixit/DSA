package DSA.SortingAlgorithm;

public class InsertionOrder {
    public static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            // Loop to find the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
    }

      public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr ={7,3,2,5,1,4,6};
        insertionSort(arr, n);
        printArray(arr, n);
    }
}
