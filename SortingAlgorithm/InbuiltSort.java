package DSA.SortingAlgorithm;
import java.util.Arrays;

public class InbuiltSort {
     public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr ={7,3,2,5,1,4,6};
        Arrays.sort(arr);
        printArray(arr, n);
        
    }

}
