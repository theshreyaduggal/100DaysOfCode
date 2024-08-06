class Solution {
    public String reorganizeString(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i), 1);
            }
        }

        char maxFreqChar = '\0';
        int maxFreq = 0;

        for(char key : map.keySet())
        {
            if(map.get(key) > maxFreq)
            {
                maxFreq = map.get(key);
                maxFreqChar = key;
            }
        }

        if(maxFreq > (s.length()+1)/2)
        {
            return "";
        }

        char[] array = new char[s.length()];
        int k = 0;

        for(int i=0; i<maxFreq; i++)
        {
            array[k] = maxFreqChar;
            k = k+2;
        }

        map.remove(maxFreqChar);

        for(char key : map.keySet())
        {
            if(k >= s.length())
            {
                k = 1;
            }


            for(int i=0; i<map.get(key); i++)
            {
                if(k >= s.length())
                {
                    k = 1;
                }

                array[k] = key;
                k = k+2;
            }
        }

        return new String(array);    
    }
}