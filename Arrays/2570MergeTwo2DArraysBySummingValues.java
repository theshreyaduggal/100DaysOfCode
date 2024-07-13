class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        ArrayList<int[]> list = new ArrayList<>();
        int i=0;
        int j=0;

        for (; i<nums1.length && j<nums2.length; )
        {
            if (nums1[i][0] == nums2[j][0])
            {
                nums1[i][1] = nums1[i][1] + nums2[j][1];
                list.add (nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i][0] < nums2[j][0])
            {
                list.add(nums1[i]);
                i++;
            }
            else
            {
                list.add(nums2[j]);
                j++;
            }
        }    

        while (i < nums1.length)
        {
            list.add(nums1[i]);
            i++;
        }

        while (j < nums2.length)
        {
            list.add(nums2[j]);
            j++;
        }

        int[][] array = new int[list.size()][2];

        for (int k=0; k<list.size(); k++)
        {
            array[k] = list.get(k);
        }

        return array;
    }
}