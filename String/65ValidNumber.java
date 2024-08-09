class Solution {
    public boolean isNumber(String s) 
    {
        boolean sign = false;
        boolean num = false;
        boolean dec = false;
        boolean expo = false;

        for (char letter : s.toCharArray())
        {
            if ((letter == '-' || letter == '+') && !sign && !num)
            {
                sign = true;
            } 

            else if (letter == '0' || letter == '1' || letter == '2' || letter == '3' || letter == '4' || letter == '5' || letter == '6' || letter == '7' || letter == '8' || letter == '9') 
            {
                num = true;
                sign = true;
            } 
        
            else if (letter == '.' && !dec)
            {
                dec = true;
                sign = true;
            } 
            
            else if ((letter == 'e' || letter == 'E') && num && !expo)
            {
                expo = true;
                dec = true;
                sign = false;
                num = false;
            } 
            else 
            {
                return false;
            }
        }

        return num;    
    }
}