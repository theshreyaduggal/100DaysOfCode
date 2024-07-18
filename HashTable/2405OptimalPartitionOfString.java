class Solution {
    public int partitionString(String s) 
    {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        char[] ch = s.toCharArray();

        for (int i=0; i<ch.length; i++)
        {
            if (set.contains(ch[i]))
            {
                count++;
                set.clear();
            }
            
            set.add(ch[i]);
        }   

        return count+1; 
    }
}