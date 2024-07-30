class Solution {
    public String frequencySort(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) 
        {
            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }

        String str = "";
       
        while (!map.isEmpty()) 
        {
            int maxFrequency = Integer.MIN_VALUE;
            char maxChar = '\0'; 

            for (char key: map.keySet()) 
            {
                if (map.get(key) > maxFrequency) 
                {
                    maxFrequency = map.get(key);
                    maxChar = key;
                }
            }

            for (int i = 0; i < maxFrequency; i++) 
            {
                str = str + maxChar;
            }
           
            map.remove(maxChar);
        }
     
        return str;    
    }
}