class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String[] str = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        
        if(str.length != pattern.length())
        {
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String s1 = str[i];
            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(s1))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(s1))
                {
                    return false;
                }
            }
            map.put(ch, s1);
        }
      return true;      
    }
}