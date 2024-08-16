class Solution {
    public long maxPoints(int[][] points) 
    {
        int row = points.length;
        int cols = points[0].length;

        long[] storage = new long[cols];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<cols; j++)
            {
                storage[j] = storage[j] + points[i][j];
            }

            for(int k=1; k<cols; k++)
            {
                storage[k] = Math.max(storage[k], storage[k-1]-1);
            }

            for(int l=cols-2; l>=0; l--)
            {
                storage[l] = Math.max(storage[l], storage[l+1]-1);
            }
        }

        long result = 0;

        for(int i=0; i<cols; i++)
        {
            result = Math.max(result, storage[i]);
        }

        return result;    
    }
}