class Solution {
    public int minSetSize(int[] arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) 
        {
            if (map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else
            {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) 
        {
            pq.add(map.get(key));
        }

        int size = arr.length;
        int count = 0;

        while (size > arr.length / 2) 
        {
            size = size - pq.remove();
            count++;
        }

        return count;    
    }
}