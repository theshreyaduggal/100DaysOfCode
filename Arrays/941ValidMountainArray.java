class Solution {
    public boolean validMountainArray(int[] arr) 
    {
        if (arr.length < 3) 
        {
            return false;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start+1 < arr.length-1 && arr[start] < arr[start+1])
        {
            start++;
        }
        while(end-1 > 0 && arr[end] < arr[end-1]) 
        {
            end--;
        }

        if (start == end)
        {
            return true;
        }  
        else
        {
            return false;
        }
    }
}