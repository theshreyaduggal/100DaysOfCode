class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<array.length; i++)
        {
            if (map.containsKey(array[i]))
            {
                map.put(array[i], map.get(array[i])+1);
            }
            else
            {
                map.put(array[i], 1);
            }
        }

        int count = map.get(array[0]);

        for (int k=0; k<array.length; k++)
        {
            if (map.get(array[k]) != count)
            {
                return false;
            }
        }
        return true;
    }
}