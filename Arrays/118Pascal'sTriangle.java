class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        int num = 0;
        for (int i=1; i<=numRows; i++)
        {
            num = 1;
            List<Integer> list2 = new ArrayList<>();

            for (int j=0; j<i; j++)
            {
                if (j==0 || j == i-1)
                {
                    list2.add(1);
                }
                else
                {
                    num = (num * (i-j)) / j;
                    list2.add(num);
                }
            }
            list.add(list2);
        }    

        return list;
    }
}