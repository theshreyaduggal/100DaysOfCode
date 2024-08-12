class Solution {
    public int magicalString(int n) 
    {
        if(n <= 3)
        {   
            return 1;
        }
        
        int[] arr = new int[n];
        arr[0] = 1; 
        arr[1] = 2; 
        arr[2] = 2;

        int len = 2;
        int index = 3;
        int count = 1;
        int num = 1;

        while(index < n)
        {
            for(int i=0; i<arr[len] && index < n; i++)
            {
                arr[index] = num;
                index++; 
                
                if(num == 1)
                {
                    count++;
                }
            }

            if (num == 1) 
            {
                num = 2;
            }
            else
            {
                num = 1;
            }
            
            len++;
        }

        return count;   
    }
}