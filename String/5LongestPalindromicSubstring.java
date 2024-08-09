class Solution {
    public String longestPalindrome(String s) 
    {
        if (s == null || s.length() == 0) 
        {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i=0; i<s.length(); i++) 
        {
            int len1 = helper(i, i, s);
            int len2 = helper(i, i+1, s);

            int length = Math.max(len1, len2);

            if (length > end - start) 
            {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return s.substring(start, end + 1);     
    }

    public int helper(int left, int right, String str) 
    {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) 
        {
            left--;
            right++;
        }

        return right - left - 1;
    }

}