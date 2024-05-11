//this code Beats 66.99% of users with Java

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String stringWord1="";
       String stringWord2="";
       for(String word: word1){
          stringWord1+=word;
       }
       for(String word: word2){
          stringWord2+=word;
       }
    return stringWord1.equals(stringWord2);
    }
}
