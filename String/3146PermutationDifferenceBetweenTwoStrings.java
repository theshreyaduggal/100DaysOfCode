class Solution {
    public int findPermutationDifference(String s, String t) 
    {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        int sum = 0;

        for(int i=0; i<array1.length; i++)
        {
            for (int j=0; j<array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    sum = sum + Math.abs(i-j);
                }
            }
        }    
        return sum;
    }
}