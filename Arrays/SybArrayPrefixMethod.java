package DSA.Arrays;

import java.util.Scanner;

public class SybArrayPrefixMethod {

    public static void PrefixArrayMaxSumMethod(int[] arr,int n){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum = 0;
        int[] prefixArray = new int[n];
        prefixArray[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixArray[i]= prefixArray[i-1]+arr[i]; 
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                curr_sum = i==0 ? prefixArray[j]:prefixArray[j] - prefixArray[i-1];    
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
            
           
        }
        System.out.println("Maximum Sum: "+max_sum);

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
        PrefixArrayMaxSumMethod(arr,size);
        sc.close();
    }
}
