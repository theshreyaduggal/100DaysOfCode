class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<accounts.length; i++)
        {
            int sum = 0;
            for (int j=0; j<accounts[0].length; j++)
            {
                sum = sum + accounts[i][j];
            }
            list.add(sum);
        }    
        int max = list.get(0);
        for (int k=0; k<list.size(); k++)
        {
            if (max < list.get(k))
            {
                max = list.get(k);
            }
        }
        return max;
    }
}