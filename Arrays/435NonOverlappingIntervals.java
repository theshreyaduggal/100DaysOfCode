class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int n = intervals.length;

        int start = intervals[0][1];

        for(int i=1; i<n; i++)
        {
            if(intervals[i][0] >= start)
            {
                start = intervals[i][1];
                count++;
            }
        }

        return n-count;    
    }
}