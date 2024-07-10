class Solution {
    public int[] constructRectangle(int area) 
    {
        int[] ans = new int[2];
        int num = (int) Math.sqrt(area); 
        for (; num>0; num--)
        {
            if (area % num == 0)
            {
                ans[0] = (area/num);
                ans[1] = num;
                break;
            }
        }  
        return ans;
    }
}