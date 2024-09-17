class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");

        for (String str1 : s1Array)
        {
            if (map.containsKey(str1))
            {
                map.put(str1, map.get(str1)+1);
            }
            else
            {
                map.put(str1, 1);
            }
        }

        for (String str2 : s2Array)
        {
            if (map.containsKey(str2))
            {
                map.put(str2, map.get(str2)+1);
            }
            else
            {
                map.put(str2, 1);
            }
        }

        for (String key : map.keySet())
        {
            if (map.get(key) == 1)
            {
                list.add(key);
            }
        }

        String[] words = new String[list.size()];

        int i = 0;
        for (String s : list)
        {
            words[i] = list.get(i);
            i++;
        }

        return words;
    }
}