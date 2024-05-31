class Solution {
    public int[] singleNumber(int[] nums) {
        int xorOfUnique = 0;
        for(int val : nums){
            xorOfUnique ^= val;
        }
        
        int rightSetBitMask = xorOfUnique & -xorOfUnique;
        
        int x = 0, y=0;
        
        for(int val : nums){
            if((val & rightSetBitMask) == 0){
                x ^= val;
            }else{
                y ^= val;
            }
        }
        
        int[] ans = new int[2];
        ans[0] = x;
        ans[1] = y;
        
        return ans;
    }
}
