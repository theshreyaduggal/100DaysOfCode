class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i=0; i<chars.length(); i++)
        {
            char ch = chars.charAt(i);
            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
        }

        for (int i=0; i<words.length; i++)
        {
            for (int j=0; j<words[i].length(); j++)
            {
                int freq = charFrequency(words[i], String.valueOf(words[i].charAt(j)));
                char ch = words[i].charAt(j);

                if (!map.containsKey(ch) || map.get(ch) < freq)
                {
                    break;
                }
                else if (j == words[i].length()-1)
                {
                    sum = sum + words[i].length();
                }
            }
        }
        return sum;    
    }

    public int charFrequency(String word, String ch)
    {
        int freq = 0;
        for (int i=0; i<word.length(); i++)
        {
            if (String.valueOf(word.charAt(i)).equals(ch))
            {
                freq++;
            }
        }
        return freq;
    }
}