class Solution {
    public boolean isFascinating(int n) 
    {
        int n1 = n * 2;
        int n2 = n * 3;
        String str0 = Integer.toString(n);
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2); 

        String str = str0 + str1 + str2;
       
        if (str.contains("0"))
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<str.length(); i++)
        {
            if (map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        } 
        for (char key : map.keySet())
        {
            if (map.get(key) != 1)
            {
                return false;
            }
        }
        return true;
    }
}