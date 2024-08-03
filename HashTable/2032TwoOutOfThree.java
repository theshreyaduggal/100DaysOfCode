class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<nums1.length; i++)
        {
            if (map1.containsKey(nums1[i]))
            {
                map1.put(nums1[i], map1.get(nums1[i])+1);
            }
            else
            {
                map1.put(nums1[i], 1);
            }
        }
        for (int j=0; j<nums2.length; j++)
        {
            if (map1.containsKey(nums2[j]) &&  list.contains(nums2[j])==false)
            {
                list.add(nums2[j]);
            }
            else
            {
                map2.put(nums2[j], 1);
            }
        }
        for (int k=0; k<nums3.length; k++)
        {
            if (map1.containsKey(nums3[k]) &&  list.contains(nums3[k])==false)
            {
                list.add(nums3[k]);
            }
            else if (map2.containsKey(nums3[k]) &&  list.contains(nums3[k])==false)
            {
                list.add(nums3[k]);
            }
        }
        return list; 
    }
}