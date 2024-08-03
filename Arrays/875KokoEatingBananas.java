class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int min = 1;
        int max = 0;

        for (int i : piles) 
        {
            if (max < i) 
            {
                max = i;
            }
        }

        if (h == piles.length)
        {
            return max;
        }

        while (min <= max) 
        {
            int temp = 0;
            int mid = (min + max) / 2;

            for (int i : piles) 
            {
                temp = temp + i / mid;

                if (i % mid > 0) 
                {
                    temp++;
                }
            }

            if (temp <= h && temp > 0) 
            {
                max = mid - 1;
            }
            else if (temp > h || temp < 0) 
            {
                min = mid + 1;
            }
        }

        return min;    
    }
}