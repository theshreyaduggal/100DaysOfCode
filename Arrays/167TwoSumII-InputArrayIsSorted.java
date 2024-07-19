class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] array = new int[2];
        int left = 0;
        int right = numbers.length-1;

        while (left < right)
        {
            int sum = numbers[left] + numbers[right];

            if (sum == target)
            {
                array[0] = left+1;
                array[1] = right+1;
                return array;
            }
            else if (sum > target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }

        return new int[]{-1,-1};
    }
}