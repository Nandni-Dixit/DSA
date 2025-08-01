package DSA.Strings;

import java.util.Scanner;

public class StringCompression {

    public static String stringCompression(String str){
    StringBuilder sb = new StringBuilder("");
    
    
    
    for(int i=0;i<str.length();i++){
        sb.append(str.charAt(i));
        int count=1;
        while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
            count++;
            i++;
        }
        if(count>1){
            sb.append(count);
        }
    }
    return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println(stringCompression(str));

        sc.close();
    }
    
}
