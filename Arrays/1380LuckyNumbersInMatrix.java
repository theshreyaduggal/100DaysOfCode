class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int num = 0;

        for (int i=0; i<rows; i++)
        {
            int min = matrix[i][0];
            num = 0;
            for (int j=0; j<cols; j++)
            {
                if (min > matrix[i][j])
                {
                    min = matrix[i][j];
                    num = j;  
                }
            }

            boolean check = true;
            for (int k=0; k<rows; k++)
            {  
                check = true;
                if (matrix[k][num] > matrix[i][num])
                {
                    check = false;
                    break;
                }
            } 

            if (check)
            {
                list.add(matrix[i][num]);
            }
        }    

        return list;
    }
}