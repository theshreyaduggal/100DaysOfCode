class Solution {
    public List<Integer> sequentialDigits(int low, int high) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1; i<=9; i++)
        {
            int num = i;
            int nextNum = i+1;

            while(num <= high && nextNum <=9)
            {
                num = num*10 + nextNum;
                if (low<=num && num<=high)
                {
                    list.add(num);
                }
                nextNum++;
            }
        }    
        list.sort(null);
        return list;
    }
}