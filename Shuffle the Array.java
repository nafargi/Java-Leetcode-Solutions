class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans= new int [2*n];
        int[] temp1 = new int [n];
        int[] temp2 = new int [n];

        for(int i=0; i<2*n; i++){
        
            if(i < n){
                temp1[i]=nums[i];
            }
            else{
                temp2[i - n]=nums[i];
            }
        }

             int counter1=0 ;
             int counter2=0;
      for(int i=0; i < 2*n; i++){
        if(i%2==0){

            ans[i]=temp1[counter1];
            counter1++;

        }
        else{
            ans[i]=temp2[counter2];
            counter2++;
        }
      }
      return ans;   
        
    }
}
