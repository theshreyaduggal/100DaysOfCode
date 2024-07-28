class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int rows = mat.length;
        int sum = 0;
        for (int i=0; i<rows; i++)
		{
			sum=sum + mat[i][i];
		} 
        for (int j=0; j<rows/2; j++)
        {
            sum = sum + mat[j][(rows-1)-j] + mat[(rows-1)-j][j];
        }
        return sum;  
    }
}