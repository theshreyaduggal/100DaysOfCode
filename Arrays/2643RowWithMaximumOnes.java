class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int[] ans = new int[2];
        int rows = mat.length;
        int cols = mat[0].length;
        int max = 0;  

        for (int i=0; i<rows; i++)
        {
            int count = 0;
            for (int j=0; j<cols; j++)
            {
                if (mat[i][j] == 1)
                {
                    count++;
                }
            }
            if (count > max)
            {
                max = count;
                ans[0] = i;
                ans[1] = max;

            }
        }  
        return ans;
    }
}