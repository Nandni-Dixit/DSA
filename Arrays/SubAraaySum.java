// Finding the maximum Sub-array Sum using BRUTE FORCE
// TIME COMPLEXITY: O(n^3)
package DSA.Arrays;
import java.util.*;
public class SubAraaySum {
    public static void subAraaySum(int[] arr, int n){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                for(int k=i;k<j;k++){
                    curr_sum += arr[k];
                }
                System.out.println("Current  Sum :"+curr_sum);
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
                curr_sum = 0;
            }
        }
        System.out.println("Maximum Sum :"+max_sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Getting Size of an Array
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        // Defining Array
        int[] arr = new int[size];
        // Getting User input for Array Values
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+"th Element");
            arr[i]=sc.nextInt();
        }
        subAraaySum(arr,size);
        sc.close();
    }
}
