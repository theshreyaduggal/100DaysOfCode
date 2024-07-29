class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<words.length; i++)
        {
            if (map.containsKey(words[i]))
            {
                map.put(words[i], map.get(words[i])+1);
            }
            else
            {
                map.put(words[i], 1);
            }
        }

        List<String> list = new ArrayList<>();
        Arrays.sort(words);

        while(k > 0)
        {
            int max = 0;
            String str = "";
          
            for(int i=0; i<words.length; i++)
            {
                if(map.containsKey(words[i]))
                {
                    int count = map.get(words[i]);
              
                    if(count > max)
                    {
                        max = count;
                        str = words[i];
                    }
                }
            }
            
            map.remove(str);

            if(list.contains(str) == false)
            {
                list.add(str);
            }
            
            k--;
        }       
        return list;    
    }
}