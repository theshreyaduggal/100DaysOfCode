class Solution {
    public String kthDistinct(String[] arr, int k) 
    {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) 
        {
            if (map.containsKey(str))
            {
                map.put(str, map.get(str)+1);
            }
            else
            {
                map.put(str, 1);
            }
        }

        for (String str : arr) 
        {
            if (map.get(str) == 1) 
            {
                k--;

                if (k == 0) 
                {
                    return str;
                }
            }
        }
        
        return "";    
    }
}