class Solution {
    public int[] sumZero(int n) 
    {
        int[] array = new int[n];
        int mid = n/2;
        int j=0;
        if (n % 2 == 0)
        {
            for (int i=1; i<=mid; i++)
            {
                array[j] = i;
                j++;
            }
            int m = n-1;
            for (int k= mid; k>0; k--)
            {
                array[m] = -k;
                m--;
            }
        }  
        else if (n % 2 !=0)
        {
            for (int i=0; i<mid; i++)
            {
                array[j] = i+1;
                j++;
            }

            array[mid] = 0;
            int m = mid+1;

            for (int k = mid; k>0; k--)
            {
                array[m] = -k;
                m++;
            }
        }  
        return array;
    }
}