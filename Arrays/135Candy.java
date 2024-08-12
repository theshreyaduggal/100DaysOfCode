class Solution {
    public int candy(int[] ratings) 
    {
        int[] array = new int[ratings.length];

        Arrays.fill(array,1);
        
        for(int i=1; i<ratings.length; i++)
        {
            if(ratings[i] > ratings[i-1])
            {
               array[i] = array[i-1]+1;
            }
        }

        for(int j=ratings.length-1; j>0; j--)
        {
            if(ratings[j]<ratings[j-1] && array[j]>=array[j-1])
            {
                array[j-1] = array[j]+1;
            }
        }

        return Arrays.stream(array).sum();    
    }
}