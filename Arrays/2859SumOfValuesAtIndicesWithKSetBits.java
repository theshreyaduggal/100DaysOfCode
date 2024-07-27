class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) 
    {
        ArrayList<Integer> countOne = new ArrayList<>();

        for (int i=0; i<nums.size(); i++)
        {
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for (int j=0; j<binary.length(); j++)
            {
                if (binary.charAt(j) == '1')
                {
                    count++;
                }
            }
            countOne.add(count);
        }    
      
        int sum = 0;
        for (int m=0; m<countOne.size(); m++)
        {
            if (countOne.get(m) == k)
            {
                sum = sum + nums.get(m);
            }
        }
        return sum;
    }
}