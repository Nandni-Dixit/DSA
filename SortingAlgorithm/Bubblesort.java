package DSA.SortingAlgorithm;

public class Bubblesort {
    public static void bubbleSort(int arr[],int n){
        for(int turn=0;turn<n-1;turn++){
            int swap = 0;
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                    System.out.println("Array Already sorted");
                    break;
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
        int[] arr ={1,2,3,4,5,6,7};
        bubbleSort(arr, n);
        printArray(arr, n);
    }
}
