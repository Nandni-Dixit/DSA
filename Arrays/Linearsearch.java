// Liner Search
package DSA.Arrays;
import java.util.*;
public class Linearsearch {
    public static void linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("The value find at  "+ i +"th index");
                return;
            }
            
        }
        System.out.println("Element not found in array");
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
        linearSearch(arr, num);
        sc.close();

    }
}
