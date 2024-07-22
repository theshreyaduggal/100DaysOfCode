class Solution {
    public int pivotInteger(int n) 
    {
        int start = 1;
        int end = n;
        while(start <= end)
        {
            int mid = (start + end)/2;
            int total = n*(n+1)/2; 

            int first = mid*(mid+1)/2; 
            int second = total - first + mid; 

            if(first == second) 
            {
                return mid;
            }
            if(first > second)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;    
    }
}