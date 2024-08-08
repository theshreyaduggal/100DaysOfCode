class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>(); 
        
        Arrays.sort(nums); 
        
        for (int i=0; i<nums.length-3; i++) 
        {
            for (int j=i+1; j<nums.length-2; j++) 
            {
                int left = j + 1;
                int right = nums.length - 1;
                
                while (left < right) 
                {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) 
                    {
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[left]);
                        list1.add(nums[right]);
                        
                        if (!set.contains(list1)) 
                        {
                            set.add(list1); 
                        }
                        
                        left++;
                        right--;
                    }

                    else if (sum <= target) 
                    {
                        left++;
                    } 
                    else if(sum > target)
                    {
                        right--;
                    }
                }
            }
        }
        
        list.addAll(set); 
        
        return list;   
    }
}