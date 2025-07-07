// Printing the sum of numbers in Second row
package DSA.Arrays;
import java.util.*;
public class Sumofsecondrow {
    public static void sumOfRow(int[][] arr,int row){
        if(row>0 && row<arr.length){
        int sum=0;
        for(int i=0;i<arr[row].length;i++){
            sum+=arr[row][i];
        }
        System.out.println("The sum of "+ row +"th row is "+ sum);
    }
    else{
        System.out.println("Row out of range");
    }
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
        System.out.println("Enter the row you want the sum of(between 0 and array's length-1)");
        int row = sc.nextInt();
        sumOfRow(arr, row);
        sc.close();
    }
}
