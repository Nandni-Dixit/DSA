package DSA.Strings;

import java.util.Scanner;

public class LowerCaseString {
    public static int lowerCaseVowel(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                switch (str.charAt(i)) {
                    case 'a':
                        count++;
                        break;
                    case 'e':
                        count++;
                        break;
                    case 'o':
                        count++;
                        break;
                    case 'i':
                        count++;
                        break;
                    case 'u':
                        count++;
                        break;
                
                    default:
                        break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println(lowerCaseVowel(str));
        sc.close();
    }
}
