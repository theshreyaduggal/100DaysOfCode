class Solution 
{
    int islands = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public int removeStones(int[][] stones) 
    {
        for (int i = 0; i < stones.length; i++) 
        {
            union(stones[i][0], ~stones[i][1]);
        }
        
        return stones.length - islands;  
    }

    public int find(int stone) 
    {
        if (map.putIfAbsent(stone, stone) == null) 
        {
            islands++;
        }

        if (map.get(stone) != stone) 
        {
            map.put(stone, find(map.get(stone)));
        }

        return map.get(stone);
    }

    public void union(int stone1, int stone2) 
    {
        stone1 = find(stone1);
        stone2 = find(stone2);
        
        if (stone1 != stone2) 
        {
            map.put(stone1, stone2);
            islands--;
        }
    }
}