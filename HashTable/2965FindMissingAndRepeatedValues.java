class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int rows = grid.length;
        int cols = grid[0].length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                if (map.containsKey(grid[i][j]))
                {
                    list.add(grid[i][j]);
                }
                else
                {
                    map.put(grid[i][j], 1);
                }
            }
        }    

        for (int j=1; j<=rows*cols; j++)
        {
            if (!map.containsKey(j))
            {
                list.add(j);
            }
        }    

        int[] ans = new int[list.size()];
        for (int i=0; i<list.size(); i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}