// Take an Array from the user , Search for a given number and print the index at which it occurs.
package DSA.Arrays;
import java.util.*;
public class Searchnumber {
    public static void search(int arr[],int num){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count ++;
                System.out.println("The number found in " + i + "th index");
           }
        }
        if (count==0) {
        System.out.println("Number not presnet in arrray");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value for "+ (i+1) +"th position:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want the Search");
        int num = sc.nextInt();
        search(arr,num);
        sc.close();
    }
}
