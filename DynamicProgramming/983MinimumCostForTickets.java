class Solution {
    public int mincostTickets(int[] days, int[] costs) 
    {
        int len = days[days.length-1];
        int[] array = new int[len+1];

        int d = 0;

        for(int i=1; i<=len; i++)
        {
            if(i < days[d])
            {
                array[i] = array[i-1];
            }
            else
            {
                array[i] = Math.min(array[Math.max(i-1, 0)]+costs[0], Math.min(array[Math.max(i-7, 0)]+costs[1], array[Math.max(i-30, 0)]+costs[2]));
                                                
                d++;
            }
        }
        return array[len];
    }
}