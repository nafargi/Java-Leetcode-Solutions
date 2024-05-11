//this code Beats 77.35% of users with Java
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder wordsString = new StringBuilder();
        String[] words= s.split(" ");
        for(int i=0; i<k; i++){
           wordsString.append(words[i]).append(" ");
        }
        return wordsString.toString().trim();
    }
}
