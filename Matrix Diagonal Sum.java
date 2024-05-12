//this code is Beats 100.00% of users with Java
class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0;
        int n= mat.length-1;
        for(int i=0; i<mat.length; i++){
             for(int j=0; j<mat.length; j++){
                if(i==j){
                    sum=sum + mat[i][j] + mat[i][n];
                    if(i == n){
                        sum= sum - mat[i][n];
                    }
                    n--;
                }
             }
        }
        return sum;
    }
};
