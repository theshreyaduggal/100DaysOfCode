class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;

        int[] array = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) 
        {
            array[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < m; i++) 
        {
            array[k] = nums2[i];
            k++;
        }

        Arrays.sort(array);

        int total = array.length;

        if (total % 2 == 1) 
        {
            return (double) array[total / 2];
        } 
        else 
        {
            int middle1 = array[total / 2 - 1];
            int middle2 = array[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }    
    }
}