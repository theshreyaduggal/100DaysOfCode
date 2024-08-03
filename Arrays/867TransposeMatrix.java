class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        int rows = matrix.length;
		int cols = matrix[0].length;
        
        int[][] transpose = new int[cols][rows];

		for (int i=0; i<cols; i++)
		{
			for (int j=0; j<rows; j++)
			{
				transpose[i][j] = matrix[j][i];
			}
		}
		 return transpose;     
    }
}