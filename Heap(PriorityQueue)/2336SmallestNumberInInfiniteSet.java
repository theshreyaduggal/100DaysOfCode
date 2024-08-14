class SmallestInfiniteSet 
{
    PriorityQueue<Integer> pq;
    HashSet<Integer> set;
    int nextSmallest;

    public SmallestInfiniteSet() 
    {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        nextSmallest = 1;
    }
    
    public int popSmallest() 
    {
        if (!pq.isEmpty()) 
        {
            int smallest = pq.remove();
            set.remove(smallest);
            return smallest;
        } 
        else 
        {
            return nextSmallest++;
        }   
    }
    
    public void addBack(int num) 
    {
        if (num < nextSmallest && set.add(num)) 
        {
            pq.add(num);
        }   
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */