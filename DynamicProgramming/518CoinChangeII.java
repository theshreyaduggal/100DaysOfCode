class Solution {
    public int change(int amount, int[] coins) 
    {
        int[] storage = new int[amount + 1];
        storage[0] = 1;
        
        for (int coin : coins) 
		{
            for (int j=coin; j<=amount; j++) 
			{
                storage[j] = storage[j] + storage[j - coin];
            }
        }
        
        return storage[amount];    
    }
}