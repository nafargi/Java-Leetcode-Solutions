class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count=0;
       return countIdenticalPairs(nums,count,0,0,n);
     
    }

  public int countIdenticalPairs(int[] nums,int counter,int i,int j,int size){
    if(i == size-1){
        return counter;
    }

   if(j == size){
        return countIdenticalPairs(nums, counter, i+1, i+2,size);  
    }

   if(i<j && nums[i]==nums[j]){
         counter++;
        
     }

   return countIdenticalPairs(nums, counter, i, j+1,size);  
  }

}
