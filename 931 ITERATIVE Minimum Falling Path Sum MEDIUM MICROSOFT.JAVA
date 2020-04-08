/*
/*
931.ITERATIVE Minimum Falling Path Sum MEDIUM MICROSOFT JAVA

For Iterative approach

Time Complexity: O(n^2);
Space Complexity: O(1);

For Recursive Approach:

is correct but too slow.. give time limit exceeded
*/

class Solution {
   
    public int minFallingPathSum(int[][] A) {
         int max = Integer.MAX_VALUE;
    
        if(A.length == 0)
            return 0;
        //iterate through all the elements
        for (int i = 0; i < A.length; ++i){
 
            for (int j = 0; j < A[0].length; ++j){
                
                //if first row just keep it same
                //else check three options from prev row
                if(i != 0){
                    
                    int prevRow = i - 1;
                    int currentValue = A[i][j];
                    
                    int prev1 = Integer.MAX_VALUE;
                    int prev2 = Integer.MAX_VALUE;
                    int prev3 = Integer.MAX_VALUE;
                    
                    //j-1 th element
                    if(j-1 >=0)
                    {
                        prev1 = A[prevRow][j-1] + currentValue; 
                    }
                    //jth element
                    if(j >=0)
                    {            
                        prev2 = A[prevRow][j] + currentValue;
                    }
                    //j+1 th element 
                    if(j + 1 < A[0].length)
                    {
                        prev3 = A[prevRow][j+1] + currentValue;
                    }
                    A[i][j] = Math.min(Math.min(prev1,prev2),prev3);
                }
                if(i == A.length -1){
                    //tracking min value
                    if(max > A[i][j])
                        max = A[i][j];
                }
            
        
            }
        
        
        }
        return max;
    }
        
}