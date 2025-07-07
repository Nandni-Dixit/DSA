// Search in a Sorted Matrix using Stair-Case method
package DSA.Arrays;

import java.util.*;

public class SortedmatrixSearch {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of rows in matrix");
        int n = sc.nextInt();
        System.out.println("Enter the number  of cols in matrix");
        int m = sc.nextInt();
        // Defining Array
        int[][] arr = new int[n][m];
        // Entering Elemnts in array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter the ["+i+"]["+j+"] Element:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the key You want to search");
        int key = sc.nextInt();
        int row = arr.length-1;
        int col = 0;
        while(col != arr[0].length && row >=0){
            if(key==arr[row][col]){
                System.out.println("Key found at index ["+row+"]["+col+"]");
                return;
            }
            else if (key>arr[row][col]) {
                col++;
            }
            else if(key<arr[row][col]){
                row--;
            }
        }
        System.out.println("Key not found");
        sc.close();
    }
}
