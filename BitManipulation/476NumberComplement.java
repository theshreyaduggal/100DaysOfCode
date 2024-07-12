class Solution {
    public int findComplement(int num) 
    {
        String str = Integer.toBinaryString(num);
        String ans = "";
        
        char[] ch = str.toCharArray();

        for (int i=0; i<ch.length; i++)
        {
            if (ch[i] == '1')
            {
                ans = ans + '0';
            }
            else if (ch[i] == '0')
            {
                ans = ans + '1';
            }
        } 

        int result = Integer.parseInt(ans, 2);
        return result;
    }
}