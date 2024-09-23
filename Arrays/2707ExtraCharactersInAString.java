class Solution {
    public int minExtraChar(String s, String[] dictionary) 
    {
        int storage[] = new int[s.length()+1];
        HashSet<String> set = new HashSet<>();
        
        for(int i=0; i<dictionary.length; i++)
        {
            set.add(dictionary[i]);
        }

        for(int i=1; i<=s.length(); i++)
        {
            storage[i] = storage[i-1] + 1;

            for(int j=0; j<=i; j++)
            {
                String str = s.substring(j, i);

                if(set.contains(str))
                {
                    storage[i] = Math.min(storage[i], storage[j]);
                }
            }
        }

        return storage[s.length()];    
    }
}