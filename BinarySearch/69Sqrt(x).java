class Solution {
    public int mySqrt(int x) 
    {
        if (x==0)
        {
            return x;
        }

        int beg = 1;
        int last = x;

        while (beg <= last)
        {
            int mid = beg + (last - beg) / 2;

            if (mid  == x / mid)
            {
                return mid;
            }
            else if (mid > x / mid) 
            {
                last = mid - 1;
            }
            else 
            {
                beg = mid + 1;
            }
        }
        return last;
    }
}