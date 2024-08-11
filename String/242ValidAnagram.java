class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length())
        {
            return false;
        } 

        char[] array1 = s.toCharArray();
        Arrays.sort(array1);
        String str = String.valueOf(array1);

        char[] array2 = t.toCharArray();
        Arrays.sort(array2);
        String str2 = String.valueOf(array2);

        if (!str.equals(str2))
        {
            return false;
        }
        return true;
    }
}