//This code Beats 100.00% of users with Java

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0; i<accounts.length; i++){
            int sumArray=0;
          for(int j=0; j< accounts[i].length; j++){
                sumArray+=accounts[i][j];
          }
          if(sumArray>max){
            max=sumArray;
          }
    }
     return max; 
    }
}
