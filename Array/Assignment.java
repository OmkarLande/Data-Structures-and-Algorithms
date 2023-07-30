package Array;

import java.util.Arrays;

public class Assignment {
    
    //Que-1
    //Given an integer array nums, return true if any value appears at least twice in the
    // array, and return false if every element is distinct.

    //1st way (more time needed to execute)
    public static boolean isElementDuplicate(int[] a){
        
        for(int i=0; i<(a.length-1); i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //2nd way ( less time complexity O(nlogn))
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<(nums.length-1); i++){
            if( nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //que-1 
        int[] nums = {1,2,3,1};
        System.out.println(isElementDuplicate(nums));
    }

}
