class Solution {
    public boolean isHappy(int n) {
          Set<Integer>  usedNum = new HashSet<>();
        while(true){
           int sum=0;
       
            while(0 < n){
            sum += Math.pow(n%10,2);
            n = n/10;
            }
            
            if(sum == 1)
            return true;
            
            n=sum;
            
            if(usedNum.contains(n))
                return false;
        
            usedNum.add(n);
    }
    }
}
