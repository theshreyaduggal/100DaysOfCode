class Solution {
    public int[] evenOddBit(int n) 
    {
        String str = Integer.toBinaryString(n);
        int[] array = new int[2];
        int countEven = 0;
        int countOdd = 0;
        int count = 0;

        for (int i=str.length()-1; i>=0; i--)
        {
            if (str.charAt(i) =='1')
            {
                if (count % 2 == 0)
                {
                    countEven++;
                }
                else
                {
                    countOdd++;
                }
            }
            count++;
        } 
          
        array[0] = countEven;
        array[1] = countOdd;

        return array;
    }
}