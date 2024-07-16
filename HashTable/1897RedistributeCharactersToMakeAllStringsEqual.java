class Solution {
    public boolean makeEqual(String[] words) 
    {
        HashMap<Character,Integer> map = new HashMap<>();

        for(String str : words)
        {
            for(int i=0 ; i<str.length();i++)
            {
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                }
                else
                {
                    map.put(str.charAt(i), 1);
                }
            }
        }

        Set<Character> keys = map.keySet();
        for (Character key : keys) 
        {
            if(map.get(key) % words.length != 0)
            {
                return false;
            }
        }
        return true;    
    }
}