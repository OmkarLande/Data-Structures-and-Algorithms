package Array;
 
public class TrappedWater{
    public static int trappedWater(int height[]){
        int n = height.length;
        //calculate left max boundry -- array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], height[i-1]);
        }

        //calculate right max boundry -- array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], height[i+1]);
        }

        int trapWater=0;

        //loop
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax, rightmax)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //trapwater
            trapWater += (waterlevel - height[i]);  // multiply by width if available

        }
        return trapWater;
    }

    public static void main(String[] args) {
        int height[] = {8,9,4,2,6,4,3,4,9,2};
        System.out.println(trappedWater(height));
    }
}
