
/*
931. Minimum Falling Path Sum MEDIUM
RECURSICVE SOLUTION: slow solution
( 3 ^ n*n)

*/

class Solution {
    int max = Integer.MAX_VALUE;
    public int minFallingPathSum(int[][] A) {
        
        if(A.length == 0)
            return 0;
        for (int i = 0; i < A[0].length; ++i){
            helper(0, i, A, 0);      
        }
        return max;
    }
    public void helper(int i, int j, int[][] A, int sum){
        if(j < 0 || j >= A[0].length)
            return;
   
        if(i >= A.length)
        {
            if(sum < max)
                max = sum;
            return;
        }
     
    
        sum += A[i][j];
        helper( i+1, j - 1, A,sum);    
        helper( i+1, j, A,sum);
        helper( i+1, j + 1, A,sum);
     //   System.out.println(sum);
    
    }
    
} 