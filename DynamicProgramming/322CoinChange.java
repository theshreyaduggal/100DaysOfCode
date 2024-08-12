class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int[] storage = new int[amount+1];
        
        Arrays.fill(storage, amount+1);

        storage[0] = 0;

        for(int coin : coins)
        {
            for(int i=coin; i<=amount; i++)
            {
                storage[i] = Math.min(storage[i], storage[i-coin]+1);
            }
        }

        if (storage[amount] <= amount)
        {
            return storage[amount];
        }
        else
        {
            return -1;
        }
    }
}