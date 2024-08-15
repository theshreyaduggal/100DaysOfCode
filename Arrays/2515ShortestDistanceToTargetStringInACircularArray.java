class Solution {
    public int closetTarget(String[] words, String target, int startIndex) 
    {
        int min = Integer.MAX_VALUE;
        int n = words.length;

        for (int i=0; i<words.length; i++) 
        {
            if (target.equals(words[i])) 
            {
                int dis = Math.abs(i - startIndex);

                min = Math.min(min, dis);
                min = Math.min(min, n-dis);
            }
        }

        if (min == Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return min;
        }    
    }
}