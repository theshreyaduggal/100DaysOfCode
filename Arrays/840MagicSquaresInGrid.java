class Solution {
    public int numMagicSquaresInside(int[][] grid) 
    {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0 ;

        for (int i=0; i<=rows-3; i++) 
        {
            for (int j=0; j<=cols-3;j++) 
            {
                if (isMagic(grid, i, j)) 
                {
                    count++;
                }
            }
        }

        return count;    
    }

    private boolean isMagic(int[][] grid, int row, int col) 
    {
        boolean[] seen = new boolean[10];

        for (int i=row; i<row+3; i++) 
        {
            for (int j=col; j<col+3; j++) 
            {
                int num = grid[i][j];

                if (num < 1 || num > 9 || seen[num]) 
                {
                    return false;
                }

                seen[num] = true;
            }
        }

        int sum1 = grid[row][col] + grid[row][col+1] + grid[row][col+2];
        int sum2 = grid[row+1][col] + grid[row+1][col+1] + grid[row+1][col+2];
        int sum3 = grid[row+2][col] + grid[row+2][col+1] + grid[row+2][col+2];

        int sum4 = grid[row][col] + grid[row+1][col] + grid[row+2][col];
        int sum5 = grid[row][col+1] + grid[row+1][col+1] + grid[row+2][col+1];
        int sum6 = grid[row][col+2] + grid[row+1][col+2] + grid[row+2][col+2];

        int sum7 = grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2];
        int sum8 = grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col];

        if ((sum1 == 15) && (sum2 == 15) && (sum3 == 15) && (sum4 == 15) && (sum5 == 15) && (sum6 == 15) && (sum7 == 15) && (sum8 == 15))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}