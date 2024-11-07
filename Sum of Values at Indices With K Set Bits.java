class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    int sum=0;
    for(int i=0; i< nums.size(); i++){
        int num= nums.get(i);
        String binaryString = Integer.toBinaryString(i);
        char[] binaryList= binaryString.toCharArray();
          
        int counter=0;
        for(int j=0; j<binaryList.length; j++){
            if(binaryList[j] == '1')
            counter++;
          } 
           if(k == counter){
            sum+=num;
          }
       }
        
      return sum; 
    }
}
