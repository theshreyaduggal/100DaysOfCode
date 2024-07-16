class Solution {
    public int maxLengthBetweenEqualCharacters(String s) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        char[] ch = s.toCharArray();
        int ans = -1;
        for (int i=0; i<ch.length-1; i++)
        {
            for (int j=i+1; j<ch.length; j++)
            {
                if (ch[i] == ch[j])
                {
                    ans = (j-i)-1;
                    list.add(ans);
                }
            }
        }  
        if (ans >= 0)
        {
            list.sort(null);
            return list.get(list.size()-1);
        }
        return -1;
    }
}