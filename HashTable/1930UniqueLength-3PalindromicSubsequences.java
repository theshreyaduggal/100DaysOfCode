class Solution {
    public int countPalindromicSubsequence(String s) 
    {
        HashSet<String> set = new HashSet<>(); 
        int[] words = new int[26];  
        char[] ch = s.toCharArray();

        for (int i=0; i<ch.length; i++)
        {
            if (words[ch[i]-'a'] == 1)
            {
                continue;
            }
            ArrayList<String> list = new ArrayList<>();

            for (int j=i+1; j<ch.length; j++)
            {
                if (ch[j] == ch[i])
                {
                    set.addAll(list);
                    list.clear();
                }

                String str = String.valueOf(ch[i])+ch[j]+ch[i];
                list.add(str);
            }
            words[ch[i]-'a'] = 1;
        }    
        
        return set.size();
    }
}