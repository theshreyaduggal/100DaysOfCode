class Solution {
    public String largestGoodInteger(String num) 
    {
        int number = 0;
        String str = "";

        for(int i=0; i<num.length()-2; i++)
        {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2))
            {
                String sub = num.substring(i,i+3);

                if(Integer.valueOf(sub) >= number)
                {
                    number = Integer.valueOf(sub);
                    str = sub;
                }
            }
        }
        return str;
    }
}