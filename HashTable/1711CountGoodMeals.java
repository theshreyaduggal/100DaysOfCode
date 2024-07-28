class Solution {
    public int countPairs(int[] deliciousness) 
    {
        int mod = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = deliciousness.length;
        long num = 0;
        for (int meal : deliciousness) 
        {
            int power = 1;
            for (int i = 0; i < 22; i++) 
            {
                if (map.containsKey(power - meal)) 
                {
                    num = num + map.get(power - meal);
                    num = num % mod;
                }
                power = power * 2;
            }
            if (map.containsKey(meal))
            {
                map.put(meal, map.get(meal)+1);   
            }
            else
            {
                map.put(meal, 1);
            }
        }
        return (int) num;    
    }
}