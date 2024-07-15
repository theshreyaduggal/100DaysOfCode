class Solution {
    public int numberOfPoints(List<List<Integer>> nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.size(); i++)
        {
            int num1 = nums.get(i).get(0);
            int num2 = nums.get(i).get(1);

            for (int j=num1; j<=num2; j++)
            {
                set.add(j);
            }
        }  
        return set.size();  
    }
}