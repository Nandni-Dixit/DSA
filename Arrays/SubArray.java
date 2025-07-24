package DSA.Arrays;

import java.util.*;

public class SubArray {

    public static void subAraay(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
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
      subAraay(arr, num);
      sc.close();
    }
}
