class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target= new int[nums.length];
        for(int i=0;i<nums.length; i++){
             for(int j=i+1;j<nums.length; j++){
                if(index[i] >= index[j]){
                 index[i]++;
                }
             }
              target[index[i]] = nums[i];
        }
        return target;
    }
}
