class Solution {
    public String truncateSentence(String s, int k) 
    {
        String[] array = s.split(" ");
        String str = "";

        for (int i=0; i<k; i++)
        {
            str = str + array[i] + " ";
        }    
        return str.trim();
    }
}