class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        ArrayList<String> list = new ArrayList<>();
        for(String word: words)
        {
            if(checkPattern(word).equals(checkPattern(pattern)))
            {
                list.add(word);
            }
        }
        return list;
    }

    public List<Integer> checkPattern (String word)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<word.length(); i++)
        {
            if(!map.containsKey(word.charAt(i)))
            {
                map.put(word.charAt(i), count);
                list.add(count);
                count++;
            }
            else
            {
                list.add(map.get(word.charAt(i)));
            }
        }
        return list;    
    }
}