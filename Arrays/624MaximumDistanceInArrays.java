class Solution {
    public int maxDistance(List<List<Integer>> arrays) 
    {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i=1; i<arrays.size(); i++) 
        {
            List<Integer> list = arrays.get(i);
            int currMin = list.get(0);
            int currMax = list.get(list.size() - 1);

            maxDistance = Math.max(maxDistance, Math.abs(currMax - min));
            maxDistance = Math.max(maxDistance, Math.abs(max - currMin));

            min = Math.min(min, currMin);
            max = Math.max(max, currMax);
        }

        return maxDistance;    
    }
}