class Solution {
    public int numberOfWays(int n, int x) 
    {
        int mod = (int) Math.pow(10, 9)+7;

        int[] storage = new int[n + 1];
        storage[0] = 1;

        int pow;

        for (int i=1; (pow=(int) Math.pow(i, x)) <= n; i++)
        {
            for (int j=n; j>=pow; j--) //10 
            {
                storage[j] = storage[j] + storage[j - pow]; 

                storage[j] = storage[j] % mod;
            }
        }

        return storage[n];    
    }
}