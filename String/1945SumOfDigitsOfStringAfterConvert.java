class Solution {
    public int getLucky(String s, int k) 
    {
        int sum = 0;
        int num = 0;

        for(int i=0; i<s.length(); i++)
        {
            num = s.charAt(i) - 96;
            
            while(num > 0)
            {
                sum = sum + (num%10);
                num = num / 10;
            } 
        }

        k--;

        int num1 = sum;

        while(k>0 && num1>9)
        {
            sum = num1;
            num1 = 0;

            while(sum > 0)
            {
                num1 = num1 + (sum%10);
                sum = sum / 10;
            }  

            k--;   
        }

        return num1;    
    }
}