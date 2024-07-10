class Solution {
    public int countGoodRectangles(int[][] rectangles) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i=0; i<rectangles.length; i++)
        {
            if (rectangles[i][0] < rectangles[i][1])
            {
                list.add(rectangles[i][0]);
            }
            else
            {
                list.add(rectangles[i][1]);
            }
        }    
        list.sort(null);
        int max = list.get(list.size()-1);

        for (int num : list)
        {
            if (num == max)
            {
                count++;
            }
        }
        return count;
    }
}