class Solution {
    public boolean isPalindrome(String s) 
    {
        String ans = "";
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) >= 'A' && s.charAt(i) <='Z')
            {
                ans = ans + Character.toLowerCase(s.charAt(i));
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <='z')
            {
                ans = ans + s.charAt(i);
            }
            else if (s.charAt(i) >= '0' && s.charAt(i) <='9')
            {
                ans = ans + s.charAt(i);
            }
        }
        String rev = "";
		for (int i = ans.length()-1; i >=0 ; i--) 
		{
			rev=rev + ans.charAt(i);
		}
		if(ans.equals(rev))
		{
			return true;
		}
		else 
		{
			return false;
		}
    }
}