class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        ArrayList<String> list = new ArrayList<>();
        int j = 0;

        for(int i=1; i<=n; i++)
        {
            if(j < target.length)
            {
                list.add("Push");

                if(i != target[j])
                {
                    list.add("Pop");
                } 
                else
                {
                   j++;
                }
            }
        }
        return list;    
    }
}