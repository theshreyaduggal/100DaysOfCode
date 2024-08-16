class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
        int[] stops = new int[1001];
        
        for(int[] trip : trips)
        {
            stops[trip[1]] = stops[trip[1]] + trip[0];
            stops[trip[2]] = stops[trip[2]] - trip[0];
        }
        
        int count = 0;

        for(int stop : stops)
        {
            count = count + stop;
            if(count > capacity)
            {
                return false;
            }
        }
        
        return true;    
    }
}