class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        char[] array1 = jewels.toCharArray();
        char[] array2 = stones.toCharArray();
        int count = 0;

        for (int i=0; i<array1.length; i++)
        {
            for (int j=0; j<array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}