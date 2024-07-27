class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter=0;  fff
        for(List<String> item :items){
            if(ruleKey.equals("type") && ruleValue.equals(item.get(0))){
              counter++; 
            }
            else if(ruleKey.equals("color") && ruleValue.equals(item.get(1))){
              counter++;
            }
            else if(ruleKey.equals("name") && ruleValue.equals(item.get(2))){
              counter++;
            }  
        }
        return counter;
    }
}
