package DSA.SortingAlgorithm;
public class SelectionSort {
    public static void selctionSort(int[] arr,int size){
        for(int i=0;i<size-1;i++){
            int minpos =i;
            for(int j=i+1;j<size;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            // Swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
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
        selctionSort(arr, n);
        printArray(arr, n);
    }
}
