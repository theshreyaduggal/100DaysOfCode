class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) 
    {
        int arr[] = new int [n];
        int sum = 0;
        int m = rolls.length;

        for(int i=0; i<m; i++)
        {
            sum = sum + rolls[i];
        }

        int num = (mean * (m+n)) - sum;
        int k = 0;

        while(n != 0)
        {
            int number = num/n;

            if(number>6 || number <= 0)
            {
                return new int [0];
            }

            num = num - number;
            arr[k] = number;
            n--;
            k++;
        }
        
        return arr;    
    }
}