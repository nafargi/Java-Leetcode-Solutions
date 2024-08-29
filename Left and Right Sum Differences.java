//this code Beats 98.81% of users with Java

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        for(int i =0; i<nums.length-1; ++i){
           left[i+1]=nums[i] + left[i];
        }
        for(int i =nums.length -2 ; i >= 0 ; i--) {
            right[i] = right[i+1] + nums[i+1];  
        }

        for(int i=0;i<nums.length; ++i){
            nums[i]=Math.abs(right[i]-left[i]);
        }
     return nums;
    }
}
