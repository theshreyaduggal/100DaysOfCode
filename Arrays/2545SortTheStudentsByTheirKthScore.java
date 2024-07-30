class Solution {
    public int[][] sortTheStudents(int[][] score, int k) 
    {
        int n = score.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(score[i][k] > score[j][k])
                {
                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        return score;    
    }
}