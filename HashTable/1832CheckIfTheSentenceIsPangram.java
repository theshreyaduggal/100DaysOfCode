class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        char[] array = sentence.toCharArray();
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

        if (map.size() == 26)
        {
            return true;
        }
        return false;
    }
}