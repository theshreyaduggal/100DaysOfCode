class Solution {
    public int numDecodings(String s) 
    {
        if (s == null || s.length() == 0) 
        {
            return 0;
        }

        int[] storage = new int[s.length()+1];
        storage[0] = 1;
        
        if (s.charAt(0) != '0') 
        {
            storage[1] = 1;
        }
        else  
        {
            storage[1] = 0;
        }

        for (int i=2; i<=s.length(); i++) 
        {
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));

            if (first >= 1 && first <= 9) 
            {
               storage[i] = storage[i] + storage[i-1];  
            }

            if (second >= 10 && second <= 26) 
            {
                storage[i] = storage[i] + storage[i-2];
            }
        }

        return storage[s.length()];    
    }
}