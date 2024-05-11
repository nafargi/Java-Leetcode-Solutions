//this code Beats 100.00% of users with Java
class Solution {
    public int minOperations(int[] nums, int k) {
        int result=0;
        for(int i=0; i<nums.length; i++){
            if(k>nums[i]){
                result++;
            }
        }
        return result;
    }
}
