class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();  

        for (int i=0; i<nums1.length; i++)
        {
            if (map1.containsKey(nums1[i]))
            {
                map1.put(nums1[i], map1.get(nums1[i])+1);
            }
            else
            {
                map1.put(nums1[i],1);
            }
        }  

        for (int j=0; j<nums2.length; j++)
        {
            if (map1.containsKey(nums2[j]) && list.contains(nums2[j])==false)
            {
                list.add(nums2[j]);
            }
        }
        int[] array = new int[list.size()];
        for (int i=0; i<list.size(); i++)
        {
            array[i] = list.get(i);
        }

        return array;
    }
}