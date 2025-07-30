package DSA.Strings;

import java.util.Scanner;

public class SubString {
    public static String subString(String str, int si, int ei){
        String substring = "";
        for(int i = si ; i < ei ; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the Starting Index:");
        int si = sc.nextInt();
        System.out.println("Enter the Ending Index:");
        int ei = sc.nextInt();
        System.out.println(subString(str,si,ei));
        sc.close();
    }
}
