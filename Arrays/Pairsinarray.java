package DSA.Arrays;

import java.util.Scanner;

public class Pairsinarray {
    public static void pairs(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print(" ("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
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
      pairs(arr);
    sc.close();
    }
    
}

