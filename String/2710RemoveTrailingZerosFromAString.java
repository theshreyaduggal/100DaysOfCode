class Solution {
    public String removeTrailingZeros(String num) 
    {
        int count = 0;
        int size = 0;
        for (int i=num.length()-1; i>=0; i--)
        {
            if (num.charAt(i) == '0')
            {
                count++;
            }
            else
            {
                size = num.length()-count;
                break;
            }
        }   
        String str =""; 
        for (int j=0; j<size; j++)
        {
            str = str + num.charAt(j);
        }
        return str;
    }
}