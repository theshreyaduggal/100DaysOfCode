class Solution {
    public String fractionAddition(String expression) 
    {
        int numerator = 0;
        int denominator = 1;
        int i = 0;
        int n = expression.length();

        while (i < n) 
        {
            int sign = 1;
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') 
            {
                if (expression.charAt(i) == '-' )
                {
                    sign = -1;
                }
                else
                {
                    sign = 1;
                }

                i++;
            }

            int num = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) 
            {
                num = num * 10 + (expression.charAt(i) - '0');
                i++;
            }

            num = num * sign;

            i++; 
            
            int denom = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) 
            {
                denom = denom * 10 + (expression.charAt(i) - '0');
                i++;
            }

            numerator = numerator * denom + num * denominator;
            denominator = denominator * denom;

            int gcd = gcd(Math.abs(numerator), denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }

        return numerator + "/" + denominator;
    }

    private int gcd(int a, int b) 
    {
        if (b == 0 ) 
        {
            return a;
        }
        else
        {
            return gcd(b, a % b);
        }
    }    
}