// Printing the elements of Spiral matrix
package DSA.Arrays;
import java.util.*;
public class Spiralmatrix {
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
        // Logic to print Spiral matrix
        int startRow = 0 ;
        int endRow = arr.length-1 ;
        int startCol = 0 ;
        int endCol = arr[0].length-1 ;

        while (startRow<=endRow && startCol<=endCol) {
            // Top 
            for(int i=startCol;i<=endCol;i++){
                System.out.println(arr[startRow][i]);
            }
            // Right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(arr[i][endCol]);
            }
            // Bottom
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow) {
                    break;
                }
                System.out.println(arr[endRow][i]);
            }
            // Left
            for(int i=endRow-1;i>=startRow+1;i--){
                if (startCol==endCol) {
                    break;
                }
                System.out.println(arr[i][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;  
        }
        sc.close();
    }
}
