class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int[] array = new int[A.length];

        int m = 0;
        
        for(int i=0; i<A.length; i++) 
        {
            int count = 0;
            HashSet<Integer> set = new HashSet<>();
            
            for(int j=0; j<=i; j++) 
            {
                set.add(A[j]);
            }
            
            for(int k=0; k<=i; k++) 
            {
                if(!set.add(B[k])) 
                {
                    count++;
                }
            }
            
            array[m] = count;
            m++;
        }
        return array;    
    }
}