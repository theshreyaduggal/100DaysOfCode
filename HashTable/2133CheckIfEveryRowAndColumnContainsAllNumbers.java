class Solution {
    public boolean checkValid(int[][] matrix) 
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i=0; i<rows; i++)
        {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j=0; j<cols; j++)
            {
                if (map.containsKey(matrix[i][j]))
                {
                    return false;
                }
                else
                {
                    map.put(matrix[i][j], 1);
                }
            }
        } 

        for (int i=0; i<rows; i++)
        {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j=0; j<cols; j++)
            {
                if (map.containsKey(matrix[j][i]))
                {
                    return false;
                }
                else
                {
                    map.put(matrix[j][i], 1);
                }
            }
        } 
        return true;  
    }
}