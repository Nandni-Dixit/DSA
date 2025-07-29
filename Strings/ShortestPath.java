package DSA.Strings;

import java.util.Scanner;

public class ShortestPath {

    public static float getShortestPath(String str,int n){
        int x=0,y=0;
        for(int i=0;i<n;i++){
            char dir = str.charAt(i);
            // North
            if(dir=='N'){
                y++;
            }
            // South
            else if(dir=='S'){
                y--;
            }
            // East
            else if(dir=='E'){
                x++;
            }
            // West
            else{
                x--;
            }
        }
        int xSquare = x*x;
        int ySquare = y*y;
        float shortestPath = (float)Math.sqrt((xSquare+ySquare));
        return shortestPath;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(getShortestPath(str, n));
        sc.close();
    }
}
