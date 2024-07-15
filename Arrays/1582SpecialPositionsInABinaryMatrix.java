class Solution {
    public int numSpecial(int[][] mat) 
    {
        int rows = mat.length;
        int cols = mat[0].length;
        int rowSum[] = new int[rows];
        int colsSum[] = new int [cols];

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                rowSum[i] = rowSum[i] + mat[i][j];
            }
        }  
        
        for (int i=0; i<cols; i++)
        {
            for (int j=0; j<rows; j++)
            {
                colsSum[i] = colsSum[i] + mat[j][i];
            }
        } 

        int count = 0;
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colsSum[j] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}