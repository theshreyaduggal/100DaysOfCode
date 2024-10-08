class Solution {
    public void rotate(int[][] matrix) 
    {
        int length = matrix.length;
        int top = 0;
        int bottom = length - 1;
        while (top < bottom) 
        {
            for (int i=0; i<length; i++) 
            {
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
            }
            top++;
            bottom--;
        }
        for (int i=0; i<length; i++) 
        {
            for (int j=i+1; j<length; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }    
    }
}