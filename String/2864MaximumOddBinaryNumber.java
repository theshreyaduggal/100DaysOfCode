class Solution {
    public String maximumOddBinaryNumber(String s) 
    {
        int countZero = 0;
        int countOne = 0;

        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] == '0')
            {
                countZero++;
            }
            else
            {
                countOne++;
            }
        }
        
        String str = "";
        while(countOne > 1)
        {
            str = str + '1';
            countOne--;
        }
        while(countZero > 0)
        {
            str = str + '0';
            countZero--;
        }
        
        str = str + '1';

        return str;    
    }
}