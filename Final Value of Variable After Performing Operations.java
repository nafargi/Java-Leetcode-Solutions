class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n= operations.length;
        int value=0;
   
        for(int i=0; i<n ;i++){
        String  temp=operations[i];
         if( temp.equals("++X") || temp.equals("X++") ){
            value++;
         }

         else if(temp.equals("--X") || temp.equals("X--") ){
            value--;
         }
        }

        return value;
    }
}
