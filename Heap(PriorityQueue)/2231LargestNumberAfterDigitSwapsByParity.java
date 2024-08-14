class Solution {
    public int largestInteger(int num) 
    {
        char[] ch = String.valueOf(num).toCharArray();
        
        for(int i=0; i<ch.length; i++)
        {
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[j] > ch[i] && (ch[j] - ch[i]) % 2 == 0)
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        return Integer.parseInt(new String(ch));    
    }
}