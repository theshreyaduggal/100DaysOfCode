class Solution {
    public boolean halvesAreAlike(String s) 
    {
        int count1 = 0;
        int count2 = 0;
        int n = s.length()/2;
        String str = s.toLowerCase();
        for (int i=0; i<n; i++)
        {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count1++;
            }
        }  

        for (int i=n; i<s.length(); i++)
        {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count2++;
            }
        } 
        if (count1 == count2)
        {
            return true;
        } 
        return false;
    }
}