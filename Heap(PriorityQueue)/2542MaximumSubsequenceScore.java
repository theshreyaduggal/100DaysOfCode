class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) 
    {
        int n = nums1.length; 
        int[][] array = new int[n][2]; 

        for (int i=0; i<n; i++) 
        {
            array[i][0] = nums1[i]; 
            array[i][1] = nums2[i]; 
        }

        Arrays.sort(array, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b) 
            {
                return -Integer.compare(a[1], b[1]); 
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue(); 
        
        long ans = 0;
        long total = 0;

        for (int i=0; i<array.length; i++) 
        {
            total = total + array[i][0]; 
            pq.add(array[i][0]);

            if (i >= k) 
            {
                total = total - pq.remove();
            } 
            if (i >= k-1) 
            {
                ans = Math.max(ans, total * array[i][1]);
            } 
        }

        return ans;     
    }
}