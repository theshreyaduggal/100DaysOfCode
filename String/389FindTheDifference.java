class Solution {
    public char findTheDifference(String s, String t) 
    {
        int num = 0;
        for (int i : s.toCharArray())
        {
            num = num - i;
        }    
        for (int j : t.toCharArray())
        {
            num = num + j;
        }
        return (char) num;
    }
}