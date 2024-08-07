class Solution {
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> list = new ArrayList<>();
        int[] array = intervals[0];

        for (int i=1; i<intervals.length; i++) 
        {
            
            int[] interval = intervals[i];

            if (interval[0] <= array[1]) 
            {
                array[1] = Math.max(array[1], interval[1]);
            } 
            else 
            {
                list.add(array);
                array = interval;
            }
        }

        list.add(array);

        return list.toArray(new int[list.size()][]);    
    }
}