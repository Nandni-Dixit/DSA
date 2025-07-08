package DSA.Arrays;

import java.util.Scanner;

public class Binarysearch {
    public static int search(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Size of an Array");
      int n = sc.nextInt();
      int[] arr = new int[n];

      int num;
      for(num = 0; num < n; ++num) {
         System.out.println("Enter the value for " + (num + 1) + "th position:");
         arr[num] = sc.nextInt();
      }

      System.out.println("Enter the number you want the Search");
      num = sc.nextInt();
      System.out.println(search(arr, num));
      sc.close();
    }
}
