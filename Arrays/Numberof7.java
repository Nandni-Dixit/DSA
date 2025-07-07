// Print the number of 7's in a 2d array
package DSA.Arrays;
import java.util.*;
public class Numberof7 {
    // Function to find number of 7
    public static int numOfSeven(int[][] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
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
        System.out.println("Number of Seven in 2D-array :" + numOfSeven(arr));
        sc.close();
    }
}
