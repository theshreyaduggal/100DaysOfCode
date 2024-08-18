class Solution {
    public int nthUglyNumber(int n) 
    {
        int[] primes = {2, 3, 5};
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        
        pq.add(1L);
        set.add(1L);
        
        long curr = 1L;
        for (int i=0; i<n; i++) 
        {
            curr = pq.remove();

            for (int prime : primes) 
            {
                long num = curr * prime;

                if (!set.contains(num)) 
                {
                    pq.add(num);
                    set.add(num);
                }
            }
        }
        return (int)curr;    
    }
}