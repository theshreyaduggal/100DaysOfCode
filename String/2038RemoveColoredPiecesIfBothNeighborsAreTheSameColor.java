class Solution {
    public boolean winnerOfGame(String colors) 
    {
        if(colors.length() <= 2) 
        {
            return false;
        }

        int A = 0;
        int B = 0;

        for(int i=1; i<colors.length()-1; i++)
        {
            char ch = colors.charAt(i);
            char a = colors.charAt(i-1);
            char b = colors.charAt(i+1);
            
            if(ch=='A' && ch==a && ch==b) 
            {
                A++;
            }
            if(ch=='B' && ch==a && ch==b) 
            {
                B++;
            }
        }

        if(A > B) 
        {
            return true;
        }
        else 
        {
            return false;  
        }  
    }
}