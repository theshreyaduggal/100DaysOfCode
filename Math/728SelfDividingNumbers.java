class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=left; i<=right; i++)
        {
            boolean check = true;
            int num = i;
            for (; num>0; num=num/10)
            {
                int rem = num % 10;
                if (rem == 0)
                {
                    check = false;
                    break;
                }
                else if (i % rem != 0)
                {
                    check = false;
                    break;
                }
            }

            if (check)
            {
                list.add(i);
            }
           
        } 
        return list;   
    }
}