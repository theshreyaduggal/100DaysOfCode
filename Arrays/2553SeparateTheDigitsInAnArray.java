class Solution {
    public int[] separateDigits(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<>();  
        for (int i=0; i<nums.length; i++)
        {
            ArrayList<Integer> numbers = new ArrayList<>();
            for(; nums[i]>0; nums[i]=nums[i]/10)
		    {
                numbers.add(nums[i]%10);
		    }
            for (int j=numbers.size()-1; j>=0; j--)
            {
                list.add(numbers.get(j));
            }
        }  
        int[] array = new int[list.size()];
        for (int k=0; k<list.size(); k++)
        {
            array[k] = list.get(k);
        }
        return array;
    }
}