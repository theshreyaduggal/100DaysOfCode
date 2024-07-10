class Solution {
    public int deleteGreatestValue(int[][] grid) 
    {
        int sum = 0;
        for (int i=0; i<grid.length; i++)
        {
            Arrays.sort(grid[i]);
        }  
        for (int j=0; j<grid[0].length; j++)
        {
            int max = 0;
            for (int k=0; k<grid.length; k++)
            {
                max = Math.max(max, grid[k][j]);
            }
            sum = sum + max;
        }  
        return sum;
    }
}