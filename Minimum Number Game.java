//this code Beats 97.30% of users with Java
class Solution {
    public int[] numberGame(int[] nums) {

        int[] arr= new int[nums.length];

        for(int i=0; i<nums.length; i+=2){

             int aliceMin=Integer.MAX_VALUE;
             int bobMin=Integer.MAX_VALUE;
            for(int j=0; j<nums.length; j++){
                aliceMin=Math.min( aliceMin,nums[j]);
            }

             arr[i+1]=aliceMin;
             for(int j=0; j<nums.length; j++){
                if(aliceMin==nums[j]){
                    nums[j]=Integer.MAX_VALUE;
                    break;
                }
             }

             for(int j=0; j<nums.length; j++){
                bobMin=Math.min(bobMin,nums[j]);
            }

           arr[i]=bobMin;
            for(int j=0; j<nums.length; j++){
                if(bobMin==nums[j]){
                    nums[j]=Integer.MAX_VALUE;
                    break;
                }
             }
           
        }
        return arr;
    }
}
