class Solution {
    public boolean checkDistances(String s, int[] distance) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if (map.containsKey(ch))
            {
                int index = map.get(ch);
                int space = i-index-1;

                if (distance[ch-'a'] != space)
                {
                    return false;
                }
            }
            else
            {
                map.put(ch, i);
            }
        }
        return true;
    }
}