class Solution {
    public String shortestPalindrome(String s) 
    {
        StringBuilder str = new StringBuilder(s).reverse();
        
        for (int i=0; i<=s.length(); i++) 
        {
            if (s.startsWith(str.substring(i))) 
            {
                return str.substring(0, i) + s;
            }
        }
        
        return ""; 
    }
}