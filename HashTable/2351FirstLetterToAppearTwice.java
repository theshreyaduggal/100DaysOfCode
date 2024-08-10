class Solution {
    public char repeatedCharacter(String s) 
    {
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<ch.length; i++)
        {
            if (map.containsKey(ch[i]))
            {
                map.put(ch[i], map.get(ch[i])+1);
            }
            else
            {
                map.put(ch[i], 1);
            }

            if (map.get(ch[i]) >= 2)
            {
                return ch[i];
            }
        }    
        return ' ';
    }
}