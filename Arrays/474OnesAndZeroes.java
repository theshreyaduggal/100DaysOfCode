class Solution {
    public int findMaxForm(String[] strs, int m, int n) 
    {
        int[][] array = new int[m + 1][n + 1];

        for(String str : strs)
        {
            int one = 0;
            int zero = 0;
            for(char ch : str.toCharArray())
            {
                if(ch == '1')
                {
                    one++;
                }
                else
                {
                    zero++;
                }
            }
            for(int i = m; i >= zero; i--)
            {
                for(int j = n; j >= one; j--)
                {
                   array[i][j] = Math.max(array[i][j], array[i - zero][j - one]+1);
                }
            }
        }
        return array[m][n];    
    }
}