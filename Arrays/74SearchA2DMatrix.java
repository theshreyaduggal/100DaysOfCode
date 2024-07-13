class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m = matrix.length ;
        int n = matrix[0].length;
        int beg = 0;
        int end = (m*n)-1;
        int mid;

        while (beg<=end)
        {
            mid = (int) ((beg+end)/2);
            int row=mid/n;
            int col=mid % n;
            if (matrix[row][col]==target)
            {
                return true;
            }
            else if (matrix[row][col]>target)
            {
                end=mid-1;
            }
            else
            {
                beg=mid+1;
            }
        }
        return false;    
    }
}