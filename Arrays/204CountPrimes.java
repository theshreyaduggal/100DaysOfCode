class Solution {
    public int countPrimes(int n) 
    {
        boolean prime[] = new boolean[n + 1];
        for (int i=0; i<n; i++)
        {
            prime[i] = true;
        }

        for (int j=2; j*j<=n; j++) 
        {
            if (prime[j] == true) 
            {
                for (int i=j*j; i<=n; i=i+j)
                {
                    prime[i] = false;
                }
            }
        }

        int count = 0;
        for (int i=2; i<=n; i++) 
        {
            if (prime[i] == true)
            {
                count++;
            }
        }

        return count;
    }
}

//we marked all numbers divisible by 2, then 3, then 5 and so on thus counting the prime numbers