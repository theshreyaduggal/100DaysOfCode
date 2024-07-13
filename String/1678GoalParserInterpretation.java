class Solution {
    public String interpret(String command) 
    {
        String str = "";
        char[] ch = command.toCharArray();

        for (int i=0; i<ch.length; )
        {
            if (ch[i] == 'G')
            {
                str = str + ch[i];
                i++;
            }
            else if (ch[i] == '(' && ch[i+1] == ')')
            {
                str = str + 'o';
                i = i+2;
            }
            else if (ch[i] == '(' && ch[i+1] == 'a' && ch[i+2] == 'l' && ch[i+3] == ')')
            {
                str = str + 'a' +'l';
                i = i+4;
            }
        }  
        return str;  
    }
}