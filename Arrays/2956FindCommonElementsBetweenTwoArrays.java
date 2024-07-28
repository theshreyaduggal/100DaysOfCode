class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        int answerFirst = 0;
        int answerTwo = 0;
        for (int i=0; i<nums1.length; i++)
        {
            for (int j=0; j<nums2.length; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    answerFirst++;
                    break;
                }
            }
        }  

        for (int m=0; m<nums2.length; m++)
        {
            for (int n=0; n<nums1.length; n++)
            {
                if (nums2[m] == nums1[n])
                {
                    answerTwo++;
                    break;
                }
            }
        } 

        int[] array = {answerFirst, answerTwo};

        return array;
    }
}