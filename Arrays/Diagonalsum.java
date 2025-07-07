// To find the sum of both the diagonals in a matrix
package DSA.Arrays;
import java.util.*;
public class Diagonalsum {
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
        // Finding Sum
        int sum=0;
        for(int i=0;i<arr.length;i++){
            // Primary Diagonal Sum
            sum+=arr[i][i];
            // Secondry Diagonal Sum
            if(i!=arr.length-1-i){
                sum+=arr[i][arr[i].length-1-i];
            }
        }
        System.out.println(sum);
    }
}
