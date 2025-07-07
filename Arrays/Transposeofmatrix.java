// Transpose of Matrix
package DSA.Arrays;
import java.util.*;
public class Transposeofmatrix {
    public static void transpose(int[][] arr,int n,int m){
        int[][] transposedMatrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transposedMatrix[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(transposedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
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
        transpose(arr,n,m);
        sc.close();
    }
}
