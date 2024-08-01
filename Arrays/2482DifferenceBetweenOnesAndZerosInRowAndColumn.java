class Solution {
    public int[][] onesMinusZeros(int[][] grid) 
    {
        int[] rowDiff = new int[grid.length];
        int[] colDiff = new int[grid[0].length];

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    rowDiff[i]++;
                    colDiff[j]++;
                } 
                else 
                {
                    rowDiff[i]--;
                    colDiff[j]--;
                }
            }
        }
        
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                grid[i][j] = rowDiff[i] + colDiff[j];
            }
        }

        return grid;     
    }
}