class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for (int i=0; i<strs.length; i++)
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String word = String.valueOf(ch);

            if (map.containsKey(word))
            {
                list.get(map.get(word)).add(strs[i]);
            }
            else
            {
                map.put(word, list.size());
                List<String> list1 = new ArrayList<>();
                list1.add(strs[i]);
                list.add(list1);
            }
        } 
        return list;
    }
}