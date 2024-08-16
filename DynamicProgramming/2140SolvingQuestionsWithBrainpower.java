class Solution {
    public long mostPoints(int[][] questions) 
    {
        int n = questions.length;
        long[] storage = new long[n + 1];
        
        for (int i=n-1; i>=0; i--) 
        {
            int next = i + questions[i][1] + 1;
            
            if (next >= n)
            {
                storage[i] = Math.max(questions[i][0], storage[i+1]);
            }
            else
            {
                storage[i] = Math.max(questions[i][0]+storage[next], storage[i+1]);
            }
        }

        return storage[0];    
    }
}