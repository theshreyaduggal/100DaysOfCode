class Solution {
    public int vowelStrings(String[] words, int left, int right) 
    {
        int count = 0;
        for(int i=left; i<=right; i++)
        {
            String word = words[i];
            int n = words[i].length()-1;

            if ((word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' || word.charAt(0)=='o' || word.charAt(0)=='u' ) && (word.charAt(n)=='a' || word.charAt(n)=='e' || word.charAt(n)=='i' || word.charAt(n)=='o' || word.charAt(n)=='u'))
            {
                count++;
            } 
        }     
        return count;
    }
}