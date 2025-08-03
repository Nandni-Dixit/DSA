// Time Complexity = O(n^2) due to use of selection sort in sorting
// can be reduced to  O(n logn) if we use inbuilt .sort method
package DSA.Strings;
import java.util.*;
public class Anagrams {

    public static void anagram(String str1, String str2){
        
        if(str1.length() == str2.length()){
        String firstString = sort(str1);
        String secondString = sort(str2);
        for(int i=0;i<firstString.length();i++){
            if(firstString.charAt(i) != secondString.charAt(i)){
                System.out.println("The Strings are not anagrams");
                return;
            }
        }
        }
        else{
            System.out.println("the Strings are not anagrams");
            return;
        }
        System.out.println("The strings are anagrams");
    }

    public static String sort(String str){
        StringBuilder strr = new StringBuilder(str);
        // Sorting the  String
        for(int i=0;i<strr.length();i++){
            int minpos = i;
            for(int j=i+1;j<strr.length();j++){
                if(Character.toLowerCase(strr.charAt(minpos)) > Character.toLowerCase(strr.charAt(j))){
                    minpos = j;
                }
            }
            char temp = strr.charAt(i);
            strr.setCharAt(i,strr.charAt(minpos));
            strr.setCharAt(minpos,temp);
        }

        return strr.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String str2 = sc.nextLine();
        anagram(str1, str2);
        sc.close();
    }

}
