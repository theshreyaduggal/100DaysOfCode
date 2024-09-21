class Solution {
    public List<Integer> lexicalOrder(int n) 
    {
        List<Integer> list = new ArrayList<>(n);
        int num = 1;

        for (int i=0; i<n; i++) 
        {
            list.add(num);
            
            if (num * 10 <= n) 
            {
                num = num * 10;
            } 
            else 
            {
                if (num >= n)
                {
                    num = num / 10;
                }

                num++;

                while (num % 10 == 0) 
                {
                    num = num / 10;
                }
            }
        }
        
        return list;    
    }
}