package DSA.Strings;

public class LargestString {
    public static void largestString(String[] fruits){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Guava","Papaya","Strawberry","Muskmelon"};
        largestString(fruits);
    }
}
