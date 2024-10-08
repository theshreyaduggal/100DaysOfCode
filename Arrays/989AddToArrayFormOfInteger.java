class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int len = num.length-1;
        while(len>=0 || k>0)
        {
            if(len >= 0)
            {
                k = k + num[len];
                len--;
            }

            list.add(0, k%10);
            k = k/10;
        }
        return list;
    }
}