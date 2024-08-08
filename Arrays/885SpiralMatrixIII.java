class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) 
    {
        int[][] array = new int[rows*cols][2];

        int dx = 0;
        int dy = 1;
        int n = 0;
        int temp = 0;

        for (int i=0; i<rows*cols; n++) 
        {
            for (int j=0; j<n/2+1; j++) 
            {
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                {
                    array[i] = new int[] {rStart, cStart};
                    i++;
                }
                rStart = rStart + dx;
                cStart = cStart + dy;
            }

            temp = dx;
            dx = dy;
            dy = -temp;
        }
        return array;
    }
}