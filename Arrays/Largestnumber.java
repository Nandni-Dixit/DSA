package DSA.Arrays;
import java.util.*;
public class Largestnumber {
    public static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+ i+ "th element");
            arr[i]=sc.nextInt();
        }
        System.out.println(findLargest(arr));
    }
}
