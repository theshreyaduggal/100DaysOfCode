class Solution {
    public int numTriplets(int[] nums1, int[] nums2) 
    {
        int sum = 0;
        sum = sum + solve(nums1,nums2);
        sum = sum + solve(nums2,nums1);
        return sum;
    }

    private int solve(int nums1[] , int nums2[])
    {
        int n = nums1.length;
        int m = nums2.length;
        int sum = 0;

        HashMap<Long,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            long sqr = (long)nums1[i] * (long)nums1[i];
            
            if (map.containsKey(sqr))
            {
                map.put(sqr, map.get(sqr)+1);
            }
            else
            {
                map.put(sqr, 1);
            }
        }

        for(int j=0; j<m-1; j++)
        {
            for(int k=j+1; k<m; k++)
            {
                long prod = (long)nums2[j] * (long)nums2[k];
                
                if(map.containsKey(prod))
                {
                    sum = sum + map.get(prod);
                }
            }
        }
        
        return sum;   
    }
}