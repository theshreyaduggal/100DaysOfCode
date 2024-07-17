class Solution {
    public int[][] divideArray(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int[][] array = new int[nums.length/3][3];
        int count = 0;
        int len = nums.length;

        for (int i=0; i<array.length; i++)
        {
            int min = nums[count];
            for (int j=0; j<3; j++)
            {
                if ((nums[count] - min) >k)
                {
                    return new int[0][0];
                }
                array[i][j] = nums[count++];
            }
        }
        return array;
    }
}