class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) 
    {
        int mod = 1000000007;
        int[] storage = new int[high+1];
        storage[0] = 1;

        for(int i=1; i<storage.length; i++) 
        {
            if(i-one >= 0) 
            {
                storage[i] = (storage[i]+storage[i-one]) % mod;
            }

            if(i-zero >= 0) 
            {
                storage[i] = (storage[i]+storage[i-zero]) % mod;
            }
        }

        int count = 0;
        for(int i=low; i<=high; i++) 
        {
            count = (count + storage[i]) % mod;
        }

        return (count % mod);    
    }
}