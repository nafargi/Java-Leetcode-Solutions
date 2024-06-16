// Beats 100.00%

class Solution {
    public int minPatches(int[] nums, int n) {
        if(n<=0)
            return 0;
        
        int st = 1;
        long ed = 0;
        int cur_idx = 0;
        int count = 0;
        int len = nums.length;
        while(ed<n)
        {
            if(cur_idx < len && nums[cur_idx]<=ed+1 && nums[cur_idx]>=st)
            {
                ed += nums[cur_idx++];
            }
            else
            {
                long tmp = ed + 1;
                ed += tmp;
                count ++;
            }
        }
        return count;
    }
}
