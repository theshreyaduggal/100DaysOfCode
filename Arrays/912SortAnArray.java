class Solution {
    public int[] sortArray(int[] nums) 
    {
        mergeSort(nums,0,nums.length-1);
        return nums;     
    }

    public static void merge(int[] arr, int beg, int mid, int end) 
    {
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) 
        {
            left[i] = arr[beg + i];
        }

        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) 
        {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = beg;
        while (i < n1 || j < n2) 
        {
            if (j == n2 || i < n1 && left[i] < right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
        } 
    }    
    public static void mergeSort(int[] arr, int beg, int end) 
    {
        if (beg < end) 
        {
            int mid = (beg + end) / 2;  
            mergeSort(arr, beg, mid);  
            mergeSort(arr, mid + 1, end);  
            merge(arr, beg, mid, end); 
        }
    }
}