class Solution {
    public int countVowelStrings(int n) 
    {
        int a=1;
        int e=1;
        int i=1;
        int o=1;
        int u=1;

        for(int k=1; k<n; k++)
        {
            a = a+e+i+o+u;
            e = e+i+o+u;
            i = i+o+u;
            o = o+u;
        }

        return a+e+i+o+u;    
    }
}