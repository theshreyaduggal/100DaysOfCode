class Solution {
    public String largestNumber(int[] nums) 
    {
        String[] str = new String[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            str[i] = String.valueOf(nums[i]);
        } 

        String s = "";

        Arrays.sort(str ,(a,b)->(b+a).compareTo(a+b));

        for(String strs : str)
        {
            s = s + strs;
        }
        
        if(s.charAt(0) == '0') 
        {
            return "0";
        }
        
        return s;    
    }
}