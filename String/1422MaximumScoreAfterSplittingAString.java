class Solution {
    public int maxScore(String s) 
    {
        int sum = 0;
        int countOne = 0;
        int countZero = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='1')
            {
                countOne++;
            }
        }
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)=='1')
            {
                countOne--;
            }
            else
            {
                countZero++;
            }

            sum = Math.max(sum, countZero+countOne);
        }
        return sum;    
    }
}