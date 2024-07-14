class Solution {
    public int romanToInt(String s) 
    {
        int x = 0;
        for(int i = 0; i < s.length(); i ++)
        {
            if(s.charAt(i) == 'I')
            {
                x++;
                if ((i+1)<s.length() && s.charAt(i+1) == 'V')
                {
                    x=x+3;
                    i++;
                }
                else if ((i+1)<s.length() && s.charAt(i+1) == 'X')
                {
                    x=x+8;
                    i++;
                }
            }

            else if(s.charAt(i) == 'V')
            {
               x=x+5;
            }

            else if(s.charAt(i) == 'X')
            {
                x=x+10;
                if ((i+1)<s.length() && s.charAt(i+1) == 'L')
                {
                    x=x+30;
                    i++;
                }
                else if ((i+1)<s.length() && s.charAt(i+1) == 'C')
                {
                    x=x+80;
                    i++;
                }
            }

            else if(s.charAt(i) == 'L')
            {
                x=x+50;
            }

            else if(s.charAt(i) == 'C')
            {
                x=x+100;
                if ((i+1)<s.length() && s.charAt(i+1) == 'D')
                {
                    x=x+300;
                    i++;
                }
                else if ((i+1)<s.length() && s.charAt(i+1) == 'M')
                {
                    x=x+800;
                    i++;
                }
            }
            else if(s.charAt(i) == 'D')
            {
                x=x+500;
            }

            else if(s.charAt(i) == 'M')
            {
                x=x+1000;        
            }
            
        }

        return x;    
    }
}