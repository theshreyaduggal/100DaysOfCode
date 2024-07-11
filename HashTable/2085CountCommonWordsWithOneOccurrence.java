class Solution {
    public int countWords(String[] words1, String[] words2) 
    {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int count = 0;

        for (int i=0; i<words1.length; i++)
        {
            if (map1.containsKey(words1[i]))
            {
                map1.put(words1[i], map1.get(words1[i])+1);
            }
            else
            {
                map1.put(words1[i], 1);
            }
        }
        for (int j=0; j<words2.length; j++)
        {
            if (map2.containsKey(words2[j]))
            {
                map2.put(words2[j], map2.get(words2[j])+1);
            }
            else
            {
                map2.put(words2[j], 1);
            }
        } 

        for (String key : map1.keySet())
        {
            if (map2.containsKey(key) && map1.get(key)==1 && map2.get(key)==1)
            {
                count++;
            }
        }
        return count;
    }
}