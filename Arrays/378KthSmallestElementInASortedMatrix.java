class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                list.add(matrix[i][j]);
            }
        } 

        list.sort(null);

        return list.get(k-1);    
    }
}