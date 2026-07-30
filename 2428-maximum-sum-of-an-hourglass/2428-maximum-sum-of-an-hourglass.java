class Solution {
    public int maxSum(int[][] grid) 
    {
        int max=0;
        int r = grid.length;
        int c = grid[0].length;
        for(int m=0;m<r-2;m++)
        {
            for(int n=0;n<c-2;n++)
            {
                int current = grid[m][n]     + grid[m][n + 1]     + grid[m][n + 2]
                                             + grid[m + 1][n + 1]
                             + grid[m + 2][n] + grid[m + 2][n + 1] + grid[m + 2][n + 2];
                max=Math.max(max,current);
            }
        }
        return max;
    }
}