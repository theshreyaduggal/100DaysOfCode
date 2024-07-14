class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        ArrayList<Boolean> result = new ArrayList<>();
        int total = 0; 
        boolean t = true;
        boolean f = false;
       
        int max = candies[0];
        for (int i=1; i<candies.length; i++)
        {
            if (max<candies[i])
            {
                max=candies[i];
            }
        }

        for (int i=0; i<candies.length; i++)
        {
            total= candies[i]+extraCandies;
            if(max<=total)
            {
                result.add(t);
            }
            else 
            {
                result.add(f);
            }
        }  
         return result;  
    }
}