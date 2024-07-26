class Solution {
    public int maxTurbulenceSize(int[] arr) 
    {
        int count = 0;
        int max = 0;

    for(int i=0; i<arr.length; i++) 
    {
        if(i >= 2 && ((arr[i-2] > arr[i-1] && arr[i-1] < arr[i]) || (arr[i-2] < arr[i-1] && arr[i-1] > arr[i])) ) 
        {
            count++;
        } 
        else if(i >= 1 && arr[i-1] != arr[i]) 
        {
            count = 2;
        } 
        else 
        {
            count = 1;
        }

        max = Math.max(max, count);
    }
    return max;       
    }
}