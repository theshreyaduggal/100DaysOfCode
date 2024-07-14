class Solution {
    public int similarPairs(String[] words) 
    {
        int count = 0;
        for (int i=0; i<words.length; i++)
        {
            for (int j=i+1; j<words.length; j++)
            {
                count = count + check(words[i], words[j]);
            }
        }    
        return count;
    }

    public int check(String str1, String str2)
    {
        HashSet<Character> set1 = new HashSet<>();
        for (char ch : str1.toCharArray())
        {
            set1.add(ch);
        }

        HashSet<Character> set2 = new HashSet<>();
        for (char ch : str2.toCharArray())
        {
            set2.add(ch);
        }

        if (set1.equals(set2))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
