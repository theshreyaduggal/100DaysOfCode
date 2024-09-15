class Solution {
    public int findTheLongestSubstring(String s) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int bitmask = 0;
        int maxLength = 0;

        for (int i=0; i<s.length(); i++) 
        {
            char ch = s.charAt(i);
            
            if (ch == 'a') 
            {
                bitmask ^= 1;
            } 
            else if (ch == 'e') 
            {
                bitmask ^= 2;
            } 
            else if (ch == 'i') 
            {
                bitmask ^= 4;
            } 
            else if (ch == 'o') 
            {
                bitmask ^= 8;
            } 
            else if (ch == 'u') 
            {
                bitmask ^= 16;
            }

            if (map.containsKey(bitmask)) 
            {
                maxLength = Math.max(maxLength, i+1-map.get(bitmask));
            } 
            else 
            {
                map.put(bitmask, i+1);
            }
        }

        return maxLength;
    }
}