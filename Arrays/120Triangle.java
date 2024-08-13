class Solution {
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int n = triangle.size();
        int[] array = new int[n + 1];

        for (int i=n-1; i>= 0; i--) 
        {
            for (int j=0; j<= i; j++) 
            {
                array[j] = Math.min(array[j], array[j + 1]) + triangle.get(i).get(j);
            }
        }
        
        return array[0];   
    }
}