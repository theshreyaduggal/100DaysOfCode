class Solution {
    public int minimumLength(String s) 
    {
        int i = 0;
        int j = s.length()-1;

        while (i < j && s.charAt(i) == s.charAt(j))
        {
            char ch = s.charAt(i);

            while (i <= j && ch == s.charAt(i))
            {
                i++;
            }
            while (i <= j && ch == s.charAt(j))
            {
                j--;
            }
        }    

        return Math.max(0, j-i+1);
    }
}