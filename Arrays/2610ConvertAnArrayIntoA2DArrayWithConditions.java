class Solution {
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i=0; i<nums.length;i++)
        {
            list1.add(nums[i]);
        }

        while (list1.size() != 0)
        {
            List<Integer> list2 = new ArrayList<>();
            for (int i=0; i<list1.size(); )
            {
                if  (list2.contains(list1.get(i)))
                {
                    i++;
                }
                else
                {
                    list2.add(list1.get(i));
                    list1.remove(list1.get(i));
                }
            }
            list.add(list2);
        }
        return list;
    }
}