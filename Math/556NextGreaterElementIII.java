class Solution {
    public int nextGreaterElement(int n) 
    {
        char arr[] = (Integer.toString(n)).toCharArray();
        
        int i = arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1])
        {
            i--;
        }
        
        if(i == -1)
        {
            return -1;
        }
        
        int k = arr.length-1;
        while(arr[k] <= arr[i])
        {
            k--;
        }
        
        swap(arr, i, k);
        
        String str = "";
        for(int j=0; j<=i; j++)
        {
            str = str + arr[j];
        }
        
        for(int j=arr.length-1; j>i; j--)
        {
            str = str + arr[j];
        }
        
        long number = Long.parseLong(str);
        
        if (number > Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return (int) number;    
        }
    }

    void swap(char[] arr,int i,int j)
    {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}