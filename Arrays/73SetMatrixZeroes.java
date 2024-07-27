class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[] array1 = new int[rows];
        int[] array2 = new int[cols];
        
        for (int i=0; i<rows; i++)
        {
            for (int j=0 ; j<cols; j++)
            {
                if (matrix[i][j] == 0)
                {
                    array1[i] = 1;    
                    array2[j] = 1;
                }
            }
        }
        
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                if (array1[i] == 1 || array2[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }  
    }
}