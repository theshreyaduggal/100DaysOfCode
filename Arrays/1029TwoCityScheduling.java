class Solution {
    public int twoCitySchedCost(int[][] costs) 
    {
        int[] array = new int[costs.length];
        int sum = 0;

        for(int i=0; i<costs.length; i++)
        {
            array[i] = costs[i][0] - costs[i][1];
            sum = sum + costs[i][0];
        }
        Arrays.sort(array);

        for(int i=0; i<costs.length/2; i++)
        {
            sum = sum - array[costs.length-i-1];
        }

        return sum;   
    }
}