//this code Beats 100.00% of users with Java
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n=hours.length;
        int counter=0;
        for(int i=0; i<n; i++){
            if(hours[i] >= target){
                counter++;
            }
        }
        return counter;
    }
}
