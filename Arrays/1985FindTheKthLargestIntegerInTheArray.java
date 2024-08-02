import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) 
    {
        ArrayList<BigInteger> list = new ArrayList<>();
        
        for(String n:nums)
        {
            list.add(new BigInteger(n));
        }

        list.sort(null);

        int num = list.size() - k;

        return String.valueOf(list.get(num));     
    }
}