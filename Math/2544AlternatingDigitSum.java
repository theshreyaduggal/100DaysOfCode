class Solution {
    public int alternateDigitSum(int n) 
    {
        String str = Integer.toString(n); 
        int a = 0;
        int b = 0;
        for(int i=0; i<str.length(); i=i+2)
        {
            a = a + str.charAt(i)-'0';
        }
        for(int i=1; i<str.length(); i=i+2)
        {
            b = b + str.charAt(i)-'0';
        }
        
        return a-b;    
    }
}