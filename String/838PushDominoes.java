class Solution {
    public String pushDominoes(String dominoes) 
    {
        int[] array = new int[dominoes.length()];
        int count = 0;
        int n = array.length;

        for (int i=0; i<n; i++) 
        {
            if (dominoes.charAt(i) == 'R') 
            {
                count = n;
            } 
            else if (dominoes.charAt(i) == 'L') 
            {
                count = 0;
            } 
            else 
            {
                count = Math.max(count-1, 0);
            }

            array[i] = array[i] + count;
        }

        count = 0;
        for (int i= n-1; i>= 0; i--) 
        {
            if (dominoes.charAt(i) == 'L') 
            {
                count = n;
            } 
            else if(dominoes.charAt(i) == 'R') 
            {
                count = 0;
            } 
            else 
            {
                count = Math.max(count-1, 0);
            }

            array[i] = array[i] - count;
        }

        String str = "";

        for (int num : array) 
        {
            if (num > 0) 
            {
                str = str + 'R';
            } 
            else if (num < 0) 
            {
                str = str + 'L';
            } 
            else 
            {
                str = str + '.';
            }
        }

        return str;
    }
}