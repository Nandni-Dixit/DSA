package DSA.Arrays;

import java.util.Scanner;

public class Reversearray {
    public static void reverse(int[] arr){
        int start=0;
        int end = arr.length - 1;
        while(start < end){
            // logic to swap values
            arr[start] = arr[start]+ arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        // Printing revrsed array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Size of an Array");
      int n = sc.nextInt();
      int[] arr = new int[n];

      int num;
      for(num = 0; num < n; ++num) {
         System.out.println("Enter the value for " + (num + 1) + "th position:");
         arr[num] = sc.nextInt();
      }
      reverse(arr);
      sc.close();
    }
}
