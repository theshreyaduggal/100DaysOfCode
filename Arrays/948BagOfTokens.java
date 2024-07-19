class Solution {
    public int bagOfTokensScore(int[] tokens, int power) 
    {
        Arrays.sort(tokens);
        int count = 0;
        int i = 0;
        int j = tokens.length-1; 
        int score = 0;

        while (i <= j)
        {
            if (tokens[i] <= power)
            {
                power = power - tokens[i];
                i++;
                count++; 
                score = Math.max(score, count); 
            }
            else if (count > 0)
            {
                power = power + tokens[j];
                j--;
                count--;
            }
            else
            {
                break;
            }
        }   
        return score;
    }
}