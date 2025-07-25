package DSA.Arrays;

import java.util.*;


public class Kadanesalgo {
    
    public static void kadanes(int[] arr,int n){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<n;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("Maxium sum: "+ms);
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
        kadanes(arr, size);
        sc.close();
    }
}
