// Progranm to Search an element in 2d-array
package DSA.Arrays;

import java.util.Scanner;

public class Searchin2darray {
   public static void search(int[][] arr, int num) {
      int count = 0;

      for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
         if (arr[i][j] == num) {
            ++count;
            System.out.println("The number found in [" + i +"]["+j+"]th index");
         }
      }
    }

    if (count == 0) {
         System.out.println("Number not presnet in arrray");
      }
    }

   

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows");
      int n = sc.nextInt();
      System.out.println("Enter the number of columns");
      int m = sc.nextInt();
      int[][] arr = new int[n][m];

       for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter the value for [" + i +"]["+j+"]th index");
                arr[i][j]=sc.nextInt();
            }
        }

      System.out.println("Enter the number you want the Search");
      int num = sc.nextInt();
      search(arr, num);
      sc.close();
}
}
