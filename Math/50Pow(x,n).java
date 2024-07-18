class Solution {
    public double myPow(double x, int n) 
    {
        long num = n;
        if (num<0)
        {
            num = num * (-1);
        }

        double pow =1;
        while (num > 0)
        {
            if (num % 2 == 0)
            {
                x = x*x;
                num = num/2;
            }
            else
            {
                pow = pow * x;
                num--;
            }
        }

        if (n<0)
        {
            return (double) 1/pow;
        }
		return pow;
    }
}