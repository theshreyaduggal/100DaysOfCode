class Solution {
    public int maxProduct(int[] nums) 
    {
        ArrayList<Integer> products = new ArrayList<>();
        for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                int prod = (nums[i]-1)*(nums[j]-1);
                products.add(prod);
            }
        } 
        products.sort(null);
        return products.get(products.size()-1);
    }
}