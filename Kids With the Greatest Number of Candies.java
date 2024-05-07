class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      
      List<Boolean> boolArray= new ArrayList<>();

        for(int i=0; i<candies.length; i++){
             boolean  isMax=true;
            for(int j=0; j<candies.length; j++){
                if(candies[i]+extraCandies < candies[j] ){
                    isMax=false;
                    break;
                }
            }
            boolArray.add(isMax);
        }
        return  boolArray;
    }
}
