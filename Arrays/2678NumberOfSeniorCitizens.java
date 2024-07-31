class Solution {
    public int countSeniors(String[] details) 
    {
        int[] array = new int[details.length];
       //String str ="";
        int n=0;

        for (int i=0; i<details.length; i++)
        {
            String str = details[i].substring(11,13);

            array[n] = Integer.parseInt(str); 
            n++;
        }    

        int count = 0;
        for (int j=0; j<array.length; j++)
        {
            if (array[j] > 60)
            {
                count++;
            }
        }
        return count;
    }
}