class Solution {
    public int divisorSubstrings(int num, int k) 
    {
        int count = 0;
        String str = Integer.toString(num);
        for (int i=0; i<str.length()-k+1; i++)
        {
            String sub = str.substring(i, i+k);
            int n = Integer.parseInt(sub);

            if (n==0)
            {
                continue;
            }
            else if (num % n == 0)
            {
                count++;
            }
        }    
        return count;
    }
}