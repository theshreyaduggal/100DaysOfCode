class Solution {
    public long pickGifts(int[] gifts, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int num : gifts) 
        {
            pq.add(num);
        }

        int count = 0;

        while (count < k) 
        {
            pq.add((int) Math.sqrt(pq.remove()));
            count++;
        }
        long sum = 0;

        while (!pq.isEmpty()) 
        {
            sum = sum + pq.remove();
        }

        return sum;    
    }
}