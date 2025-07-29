package DSA.Strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str,int n){
        String lowerCasestr = str.toLowerCase();
        for(int i=0;i<n/2;i++){
            // If the code enters the below if statement that means the string is not palindrome
            if(lowerCasestr.charAt(i) != lowerCasestr.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(isPalindrome(str, n));
        sc.close();
    }
}
