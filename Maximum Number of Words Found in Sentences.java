//this code Beats 85.57% of users with Java
class Solution {
    public int mostWordsFound(String[] sentences) {

        int max=Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++){
            String sentence=sentences[i];
            String[] words=sentence.split(" ");
            max=Math.max(max,words.length);   
        }
        return max;
    }
}
