package DSA.Arrays;

public class TrappedWater {
    public static int trappedWater(int height[],int n,int width){
        // calculate LeftMax-Array
        int[] leftMax = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // Caluculate Rightmax-array
        int[] rightMax = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        // loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
            // Waterlevel = min(leftmax,rightmax)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            // trappedwater=(waterlevel-barlevel)*width
            trappedWater += (waterLevel-height[i])*width;
        }
        
        return trappedWater;
    }

    public static void main(String[] args) {
        int n =7;
        int width =1;
        int[] height ={4,2,0,6,3,2,5};
       System.err.println(trappedWater(height, n, width));
    }
}
