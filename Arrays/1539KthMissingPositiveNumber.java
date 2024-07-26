class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) 
        {
            set.add(x);
        }
        int count = 0;
        int i = 1;
        while (i>0) 
        {
            if (!set.contains(i)) 
            {
                count++;
            }
            if (count == k) 
            {
                return i;
            }
            i++;  
        }
        return -1;
    }
}