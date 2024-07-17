class Solution {
    public long interchangeableRectangles(int[][] rectangles) 
    {
        long count = 0;
        HashMap<Double, Integer> map = new HashMap<>();

        for (int[] num : rectangles)
        {
            double b = num[0];
            double l = num[1];
            double result = (double) b/l;
            
            if (map.containsKey(result))
            {
                count = count + map.put(result, map.get(result)+1);
            }
            else
            {
                map.put(result, 1);
            }
        }  

        return count;
    }
}