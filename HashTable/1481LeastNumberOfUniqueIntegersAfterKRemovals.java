class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue((a,b)->map.get(a)-map.get(b));
        pq.addAll(map.keySet());

        while (!pq.isEmpty() && k>0)
        {
            int key = pq.peek();
            int val = map.get(key);

            if(k >= val)
            {
               k = k - val;
               pq.remove();
            }
            else
            {
                break;
            }
        }
        return pq.size();    
    }
}