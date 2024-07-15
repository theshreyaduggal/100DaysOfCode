class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>(); 

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i=0; i<nums1.length; i++)
        {
            set1.add(nums1[i]);
        }

        for (int i=0; i<nums2.length; i++)
        {
            set2.add(nums2[i]);
        } 

        for (int key : set1)
        {
            if (!set2.contains(key))
            {
                list1.add(key);
            }
        }

        for (int key : set2)
        {
            if (!set1.contains(key))
            {
                list2.add(key);
            }
        } 
        list.add(list1);
        list.add(list2);

        return list;
    }
}